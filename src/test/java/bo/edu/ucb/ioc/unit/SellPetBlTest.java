package bo.edu.ucb.ioc.unit;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.mockito.Mockito.*;

import bo.edu.ucb.ioc.bl.SellPetBl;
import bo.edu.ucb.ioc.dao.PetDao;
import bo.edu.ucb.ioc.dto.PetSellRequestDto;
import bo.edu.ucb.ioc.dto.PetSellResponseDto;
import bo.edu.ucb.ioc.dto.PetStoreException;
import bo.edu.ucb.ioc.entities.Pet;
import bo.edu.ucb.ioc.entities.PetType;

@ExtendWith(MockitoExtension.class)
public class SellPetBlTest {

    @Mock
    PetDao petDao;

    @Test
    public void priceLestThanEqualZero() {
        PetDao petDao = mock(PetDao.class);
        SellPetBl sellPetBlTest = new SellPetBl(petDao);

        PetSellRequestDto petSellRequestDto = new PetSellRequestDto();
        petSellRequestDto.setPetId(10);
        petSellRequestDto.setQtty(0);
        assertThrows(PetStoreException.class, () -> {
            sellPetBlTest.sellPet(petSellRequestDto);
        });
    }

    @Test
    public void verifyTotalWhenCat() {
        // PetDao petDao = new PetDaoMySQLImpl(); ESTO ESTA MAL
        // PetDao petDao = mock(PetDao.class);
        Pet mockPet = new Pet();
        mockPet.setPetId(10);
        mockPet.setName("Tomas");
        mockPet.setPetType(PetType.CAT);
        mockPet.setPrice(100.00);

        when(petDao.getPetById(10)).thenReturn(mockPet);

        SellPetBl sellPetBlTest = new SellPetBl(petDao);

        PetSellRequestDto petSellRequestDto = new PetSellRequestDto();
        petSellRequestDto.setPetId(10);
        petSellRequestDto.setQtty(5);
        assertDoesNotThrow(() -> {
             PetSellResponseDto response  = sellPetBlTest.sellPet(petSellRequestDto);
             assertNotNull(response.getFinalPrice());
             assertEquals(500.0, response.getFinalPrice());
        });
    }
}
