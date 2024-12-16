package in.abhi.Rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetRestController {

	@Autowired
	private WelcomeApi api;
	@GetMapping("/greet")
	public String getGreet()
	{
		String msg2 = api.getmsg();
		System.out.println(msg2);
		String msg="hello good marning, ";
		return msg.concat(msg2);
	}
	
	@GetMapping("/name")
	public String name()
	{
		return "my name ia abhimanyu ";
	}
}
