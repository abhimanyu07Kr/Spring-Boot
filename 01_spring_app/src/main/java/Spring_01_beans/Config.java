package Spring_01_beans;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Config {
	@Bean
    String secure()
	{
		System.out.println("securityconfig");
		return "security";
	}

}
