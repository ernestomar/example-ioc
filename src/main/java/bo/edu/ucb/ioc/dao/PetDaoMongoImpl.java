package bo.edu.ucb.ioc.dao;

import java.util.Date;

import bo.edu.ucb.ioc.entities.Pet;

public class PetDaoMongoImpl implements PetDao{

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
