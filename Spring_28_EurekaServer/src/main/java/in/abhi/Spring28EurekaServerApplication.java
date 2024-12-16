package in.abhi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class Spring28EurekaServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(Spring28EurekaServerApplication.class, args);
	}

}
