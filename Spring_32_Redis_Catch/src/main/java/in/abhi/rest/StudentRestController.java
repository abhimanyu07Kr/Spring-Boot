package in.abhi.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import in.abhi.Repo.StuRepository;
import in.abhi.entity.Student;

@RestController
public class StudentRestController {
	
	@Autowired
	private StuRepository stuRepo; 
	
	@PostMapping("/student")
	public String dataSave(@RequestBody Student stu)
	{
		stuRepo.save(stu);
		return "data saved";
	}
	
	@GetMapping("/students")
	public Iterable<Student> getStudent()
	{
		Iterable<Student> all = stuRepo.findAll();
		return all;
	}

}
