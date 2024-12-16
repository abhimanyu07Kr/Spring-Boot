package in.abhi.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import in.abhi.Binding.Student;

@RestController
public class StudentController {

	
	@GetMapping(value="/stu",
				produces = {"application/json","application/xml"},
				consumes = "text"
			)
	public ResponseEntity<Student> getdata()
	{
		Student stu = new Student(101,"abhimanyu",23);
		return new ResponseEntity<>(stu,HttpStatus.ACCEPTED);
	}
	
	
	@PostMapping(value="/stu",
			consumes = "text",
			produces = "Student"
			)
	public ResponseEntity<Student> postData(@RequestBody Student s)
	{
		return new ResponseEntity<>(s,HttpStatus.OK);
	}
}
