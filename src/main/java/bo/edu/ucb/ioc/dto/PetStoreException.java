package bo.edu.ucb.ioc.dto;

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
