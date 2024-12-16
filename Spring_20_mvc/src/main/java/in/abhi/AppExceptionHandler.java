package in.abhi;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class AppExceptionHandler {
	
	
	@ExceptionHandler(value = Exception.class)
	public String err(Exception e)
	{
		e.printStackTrace();
		return "error";
	}

}
