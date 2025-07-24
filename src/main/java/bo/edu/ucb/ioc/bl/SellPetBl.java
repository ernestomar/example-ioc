package bo.edu.ucb.ioc.bl;

import org.springframework.stereotype.Component;

import bo.edu.ucb.ioc.dao.PetDao;
import bo.edu.ucb.ioc.dto.PaymentStatus;
import bo.edu.ucb.ioc.dto.PetSellRequestDto;
import bo.edu.ucb.ioc.dto.PetSellResponseDto;
import bo.edu.ucb.ioc.dto.PetStoreException;
import bo.edu.ucb.ioc.entities.Pet;
import bo.edu.ucb.ioc.entities.PetType;

@Component
public class SellPetBl {

    private PetDao petDao;

    public SellPetBl(PetDao petDao) {
        this.petDao = petDao;
    }

    public PetSellResponseDto sellPet(PetSellRequestDto petSellRequestDto) throws PetStoreException {

        if(petSellRequestDto.getQtty() <= 0) {
            throw new PetStoreException("La cantidad no puede ser menor igual a cero");
        }

         // Obtengo la información completa
        Pet pet = petDao.getPetById(petSellRequestDto.getPetId());
        Double price = pet.getPrice();
        price = price * petSellRequestDto.getQtty();
        if (pet.getPetType() != PetType.CAT && pet.getPetType() != PetType.DOG) {
            price = price * 1.25; // 25% de impuesto por no ser perro o gato 
        }
        PetSellResponseDto result = new PetSellResponseDto();
        result.setFinalPrice(price);
        result.setPetId(petSellRequestDto.getPetId());
        result.setPaymetStatus(PaymentStatus.SUCCESS);
        return result;
    }
    
}
