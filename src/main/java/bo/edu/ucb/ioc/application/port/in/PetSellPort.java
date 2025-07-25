package bo.edu.ucb.ioc.application.port.in;

import bo.edu.ucb.ioc.application.dto.PetSellRequestDto;
import bo.edu.ucb.ioc.application.dto.PetSellResponseDto;
import bo.edu.ucb.ioc.application.dto.PetStoreException;

public interface PetSellPort {
    public PetSellResponseDto sellPet(PetSellRequestDto petSellRequestDto) throws PetStoreException; 
}

