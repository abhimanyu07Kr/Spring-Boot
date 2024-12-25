package in.abhi.RestController;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import ch.qos.logback.core.model.Model;

@RestController
public class OuthRestController {

	@GetMapping("/")
	public String getMsg()
	{
		return "welcome to Springboot";
	}
	
}
