package bo.edu.ucb.ioc.application.port.out;

import bo.edu.ucb.ioc.application.entities.Pet;

public interface PetRepositoryPort {
    Pet getPetById(int petId);
}
