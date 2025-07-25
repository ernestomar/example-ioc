package bo.edu.ucb.ioc.application.dto;

public class PetStoreException extends Exception {

    public PetStoreException() {
        super();
    }
    
    public PetStoreException(String message) {
        super(message);
    }

    public PetStoreException(String message, Throwable ex) {
        super();
    }

}
