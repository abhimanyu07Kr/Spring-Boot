package in.abhi.Rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;

@RestController
public class CircuitRestController {

	
	@GetMapping("/data")
	@CircuitBreaker(fallbackMethod = "getMsg2",name = "abhimanyu")
	public String getMsg()
	{
		System.out.println("method1");
		int n=10/0;
		return "Data Retrive from radis";
	}
	
	public String getMsg2()
	{
		System.out.println("method2");
		return "Data retrive from DB";
	}
}
