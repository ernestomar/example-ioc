package bo.edu.ucb.ioc;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import bo.edu.ucb.ioc.dao.PetDao;
import bo.edu.ucb.ioc.dao.PetDaoMongoImpl;
import bo.edu.ucb.ioc.dao.PetDaoMySQLImpl;

@Configuration
public class AppConfig {

    @Value("${database.impl}")
    public String databaseImpl;
    
    @Bean
    public PetDao getPetDao() {
        System.out.println(" VALUE: " + databaseImpl);
        switch (databaseImpl) {
            case "mongo":
                return new PetDaoMongoImpl();        
            case "mysql":
                return new PetDaoMySQLImpl();        
            default:
                return new PetDaoMySQLImpl();        
        }
        
    }

}
