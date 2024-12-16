package in.abhi.AppExectionHandler;

import java.time.LocalDateTime;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import in.abhi.binding.AppExInfo;

@RestControllerAdvice
public class AppExceptionHandler {

	@ExceptionHandler(value=Exception.class)
	public ResponseEntity<AppExInfo> getException(Exception e)
	{
		AppExInfo ae = new AppExInfo();
		ae.setExCode("SBIN0001");
		ae.setExMsg(e.getMessage());
		ae.setLocalDateTime(LocalDateTime.now());
		return new ResponseEntity<>(ae,HttpStatus.INTERNAL_SERVER_ERROR);
	}
}
