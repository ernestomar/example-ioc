package bo.edu.ucb.ioc.adapters.out.repository;

import java.util.Date;

import bo.edu.ucb.ioc.application.entities.Pet;
import bo.edu.ucb.ioc.application.port.out.PetRepositoryPort;

public class PetDaoMongoImpl implements PetRepositoryPort{

    @Override
    public Pet getPetById(int petId) {
        Pet mysql = new Pet();
        mysql.setName("Mongo");
        mysql.setPetId(3);
        mysql.setPrice(200.00);
        mysql.setDateOfBirth(new Date());
        return mysql;
    }
    
}
