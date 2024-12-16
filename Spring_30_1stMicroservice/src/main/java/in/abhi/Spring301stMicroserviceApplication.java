package in.abhi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class Spring301stMicroserviceApplication {

	public static void main(String[] args) {
		SpringApplication.run(Spring301stMicroserviceApplication.class, args);
	}

}
