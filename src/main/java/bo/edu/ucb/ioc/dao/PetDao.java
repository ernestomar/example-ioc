package bo.edu.ucb.ioc.dao;

import bo.edu.ucb.ioc.entities.Pet;

public interface PetDao {
    Pet getPetById(int petId);
}
