package in.abhi.Rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MsgRestController {

	@GetMapping("/msg")
	public String getMsg()
	{
		String msg="abhimanyu kumar";
		return msg;
	}
}
