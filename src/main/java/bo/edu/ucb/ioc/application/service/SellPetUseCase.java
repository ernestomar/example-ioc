package bo.edu.ucb.ioc.application.service;

import org.springframework.stereotype.Component;

import bo.edu.ucb.ioc.application.dto.PaymentStatus;
import bo.edu.ucb.ioc.application.dto.PetSellRequestDto;
import bo.edu.ucb.ioc.application.dto.PetSellResponseDto;
import bo.edu.ucb.ioc.application.dto.PetStoreException;
import bo.edu.ucb.ioc.application.entities.Pet;
import bo.edu.ucb.ioc.application.entities.PetType;
import bo.edu.ucb.ioc.application.port.in.PetSellPort;
import bo.edu.ucb.ioc.application.port.out.PetRepositoryPort;

@Component
public class SellPetUseCase implements PetSellPort {

    private PetRepositoryPort petDao;

    public SellPetUseCase(PetRepositoryPort petDao) {
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
