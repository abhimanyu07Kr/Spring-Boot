package in.abhi;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import in.abhi.Dao.StudentDao;
import in.abhi.Entity.Student;

@Controller
public class StudentController {
	
	@Autowired
	private StudentDao stuDao;
	
	@GetMapping("/find")
	public ModelAndView getStudent()
	{
		ModelAndView mav = new ModelAndView();
		
		List<Student> stu = stuDao.getAllStu();
		mav.addObject("stu", stu);
//		System.out.println(stu);
		
		mav.addObject("greet", "hello");
		mav.setViewName("StuView");
		return mav;
	}
	
	@GetMapping("/Form")
	public ModelAndView insertData()
	{
		ModelAndView mav = new ModelAndView();
		mav.addObject("stu", new Student());
		mav.addObject("set", "form fill");
		mav.setViewName("Form");
		return mav;
	}

	@PostMapping("/Form")
	public ModelAndView postData(Student stu)
	{
		ModelAndView mav = new ModelAndView();
		mav.addObject("greet", "hello user");
		boolean save = stuDao.save(stu);
//		System.out.println(save);
		if(save)
			mav.addObject("sussMsg","data saved");
		else
			mav.addObject("errMsg", "data not saved");
		List<Student> stu1 = stuDao.getAllStu();
		mav.addObject("stu", stu1);
		
		mav.setViewName("stuView");
		return mav;
	}
	
	@GetMapping("/delete")
	public ModelAndView deleteRecord(@RequestParam("stuId") Integer stuId)
	{
		
		ModelAndView mav = new ModelAndView();
		stuDao.deleteStu(stuId);
//		System.out.println(stuId);
		List<Student> stu1 = stuDao.getAllStu();
		mav.addObject("stu", stu1);
		mav.setViewName("stuView");
		return mav;
	}
	
	@GetMapping("/edit")
	public ModelAndView edit(@RequestParam("stuId") Integer stuId)
	{
		ModelAndView mav = new ModelAndView();
		Student stu = stuDao.getStuId(stuId);
		
		mav.addObject("stu", stu);
		
		mav.setViewName("Form");
		return mav;
	}
}
