package Ec4LuisCuriSoria;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
@EnableFeignClients
@SpringBootApplication
public class MicroServicioReservaApplication {

	public static void main(String[] args) {
		SpringApplication.run(MicroServicioReservaApplication.class, args);
	}

}
