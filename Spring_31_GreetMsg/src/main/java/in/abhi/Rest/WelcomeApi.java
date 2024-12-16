package in.abhi.Rest;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name="WELCOME-API")
public interface WelcomeApi {
	
	@GetMapping("/msg")
	public String getmsg();

}
