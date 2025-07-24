package bo.edu.ucb.ioc.dao;

import java.util.Date;

import bo.edu.ucb.ioc.entities.Pet;

public class PetDaoMySQLImpl implements PetDao{

    @Override
    public Pet getPetById(int petId) {
        Pet mysql = new Pet();
        mysql.setName("MySQL");
        mysql.setPetId(1);
        mysql.setPrice(100.00);
        mysql.setDateOfBirth(new Date());
        return mysql;
    }
    
}
