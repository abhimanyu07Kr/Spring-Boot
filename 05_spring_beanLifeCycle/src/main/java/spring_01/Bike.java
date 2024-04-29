package spring_01;

import org.springframework.stereotype.Component;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;

@Component
public class Bike {
	@PostConstruct
	public void Start()
	{
		System.out.println("bike Starting..........");
	}
	public void Work()
	{
		System.out.println("bike journy started.........");
	}
	@PreDestroy
	public void End() {
		System.out.println("bike stoped......");

	}

}
