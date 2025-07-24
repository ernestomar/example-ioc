package bo.edu.ucb.ioc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import bo.edu.ucb.ioc.bl.SellPetBl;


@SpringBootApplication
public class IocApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(IocApplication.class, args);
		SellPetBl sellPetBl = ctx.getBean(SellPetBl.class);
		sellPetBl.sellPet(5);
		
		// PetDao petDao = new PetDaoMySQLImpl();
		// SellPetBl sellPetBl = new SellPetBl(petDao);
		// sellPetBl.sellPet(5);
	}

}
