package in.abhi.Rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import in.abhi.UserException.UserException;

@RestController
public class UserRestController {
	
	@GetMapping("/id/{id}")
	public String getData(@PathVariable("id") int id)
	{
		if(id==10)
			return "abhi";
		else
			throw new UserException("bad ID");
	}

}
