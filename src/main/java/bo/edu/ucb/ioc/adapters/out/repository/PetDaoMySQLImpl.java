package bo.edu.ucb.ioc.adapters.out.repository;

import java.util.Date;

import bo.edu.ucb.ioc.application.entities.Pet;
import bo.edu.ucb.ioc.application.port.out.PetRepositoryPort;

public class PetDaoMySQLImpl implements PetRepositoryPort{

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
