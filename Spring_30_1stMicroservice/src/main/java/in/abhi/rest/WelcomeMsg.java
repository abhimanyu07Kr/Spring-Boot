package in.abhi.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeMsg {

	@GetMapping("/msg")
	public String getMsg()
	{
		String msg="Abhimanyu kumar";
		return msg;
	}
}
