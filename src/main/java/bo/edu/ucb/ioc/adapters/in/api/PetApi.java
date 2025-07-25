package bo.edu.ucb.ioc.adapters.in.api;

import java.util.Map;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import bo.edu.ucb.ioc.application.dto.PetSellRequestDto;
import bo.edu.ucb.ioc.application.dto.PetSellResponseDto;
import bo.edu.ucb.ioc.application.dto.PetStoreException;
import bo.edu.ucb.ioc.application.service.SellPetUseCase;

@RestController
@RequestMapping("/api/v1/sell")
public class PetApi {

    
    private SellPetUseCase sellPetBl;

    public PetApi(SellPetUseCase sellPetBl) {
        this.sellPetBl = sellPetBl;
    }


    @SuppressWarnings("rawtypes")
    @PostMapping("/")
    public ResponseEntity sellPet(@RequestBody PetSellRequestDto petSellRequestDto) {
        try {
            PetSellResponseDto response = sellPetBl.sellPet(petSellRequestDto);
            return ResponseEntity.ok(response);
        } catch (PetStoreException ex) {
            return ResponseEntity.status(403).body(Map.of("message", ex.getMessage()));
        }
    }
}
