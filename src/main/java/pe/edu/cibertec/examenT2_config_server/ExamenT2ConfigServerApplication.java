package pe.edu.cibertec.examenT2_config_server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class ExamenT2ConfigServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(ExamenT2ConfigServerApplication.class, args);
	}

}
