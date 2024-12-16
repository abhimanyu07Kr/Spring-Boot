package in.abhi.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MsgRestController {

	@GetMapping("/msg")
	public String getWelcomeMsg()
	{
		int x=10/0;
		try {
			
		}catch (ArithmeticException e) {
			// TODO: handle exception
			return e.getMessage();
		}
		return "hello world";
	}
	
//	@ExceptionHandler(value=ArithmeticException.class)
//	public ResponseEntity<String> handleEX(Exception e)
//	{
//		return new ResponseEntity<>(e.getMessage(),HttpStatus.INTERNAL_SERVER_ERROR);
//	}
}
