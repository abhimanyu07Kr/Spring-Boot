package in.abhi;


import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class EmpService {
	
	private EmployeeRepo empRepo;
	
	public EmpService(EmployeeRepo empRepo) {
	
		this.empRepo = empRepo;
	}


	@GetMapping("/find")
	public ModelAndView getData()
	{
		ModelAndView mav = new ModelAndView();
		List<Employee> all = empRepo.findAll();
		
		mav.addObject("emp", all);
		mav.addObject("greet", "helllo");
		mav.setViewName("index");
		return mav;
	}
	
	@PostMapping("/form")
	public ModelAndView postData(Employee emp)
	{
		ModelAndView mav = new ModelAndView();
		System.out.println(emp);
		empRepo.save(emp);
		mav.setViewName("index");
		return mav;
	}
	
	@GetMapping("/form")
	public ModelAndView form()
	{
		ModelAndView mav = new ModelAndView();
		mav.addObject("emp", new Employee());
		mav.setViewName("form");
		return mav;
	}
	
	
}
