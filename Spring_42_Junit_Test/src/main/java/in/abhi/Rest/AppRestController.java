package in.abhi.Rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import in.abhi.Service.AppService;

@RestController
public class AppRestController {

	@Autowired
	private AppService ser;
	
	@GetMapping("/msg")
	public String getMsg()
	{
		String msg = ser.getMsg();
		msg = msg.toUpperCase();
		return msg;
	}
}
