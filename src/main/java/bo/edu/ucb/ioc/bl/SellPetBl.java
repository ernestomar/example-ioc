package bo.edu.ucb.ioc.bl;

import org.springframework.stereotype.Component;

import bo.edu.ucb.ioc.dao.PetDao;
import bo.edu.ucb.ioc.entities.Pet;
import bo.edu.ucb.ioc.entities.PetType;

@Component
public class SellPetBl {

    private PetDao petDao;

    public SellPetBl(PetDao petDao) {
        this.petDao = petDao;
    }

    public void sellPet(int petId) {
         // Obtengo la información completa
        Pet pet = petDao.getPetById(petId);
        double price = pet.getPrice();
        if (pet.getPetType() != PetType.CAT && pet.getPetType() != PetType.DOG) {
            price = price * 1.25; // 25% de impuesto por no ser perro o gato 
        }
        System.out.println("Vendiendo: " + pet + " a un precio de: " + price);
    }
    
}
