package in.abhi;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SecurityRestController {

	
	@GetMapping("home")
	public String getHome()
	{
		return "this is home page"; 
	}
	
	@GetMapping("/contact")
	public String getContact()
	{
		return "this is contact page";
	}
	
	@GetMapping("/help")
	public String getHelp()
	{
		return "this is help page";
	}
}
