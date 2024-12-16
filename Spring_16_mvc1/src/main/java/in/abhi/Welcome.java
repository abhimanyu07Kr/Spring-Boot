package in.abhi;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class Welcome {
	
	
	public Welcome() {
		super();
		System.out.println("constructor");
	}
	@GetMapping("/index")
	public ModelAndView greetMsg()
	{
		ModelAndView mav = new ModelAndView();
		mav.addObject("wish", "hello ");
		return mav;
	}
	@GetMapping("/detail")
	public ModelAndView getWelcomeMsg()
	{
		ModelAndView mav = new ModelAndView();
		mav.addObject("name", "abhimnayu");
		mav.addObject("age", "21");
		System.out.println("welcome");
		mav.setViewName("index");
		return mav;
	}
	
	

}
