package in.abhi.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoRestController {
	
	@GetMapping("/demo")
	public String DemoController()
	{
		String s="";
		s.charAt(3);
//		int n=10/0;
		return "Demo class";
	}

}
