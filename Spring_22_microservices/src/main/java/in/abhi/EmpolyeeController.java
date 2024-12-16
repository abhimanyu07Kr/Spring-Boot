package in.abhi;

import java.util.List;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import in.abhi.entity.Employee;
import in.abhi.service.EmployeeService;

@RestController
public class EmpolyeeController {
	
	private EmployeeService empSer;

	public EmpolyeeController(EmployeeService empSer) {
		this.empSer = empSer;
	}
	
	@GetMapping("/employee")
	public ResponseEntity<List<Employee>> getEmployee()
	{
		List list = empSer.getAllStudent();
		return new ResponseEntity<>(list,HttpStatus.OK);
	}
	
	@PostMapping("/employee")
	public ResponseEntity<String> saveEntitiy(@RequestParam Employee emp)
	{
		empSer.save(emp);
		String body="insert succesfully";
		return new ResponseEntity<>(body,HttpStatus.OK);
	}
	
	@DeleteMapping("/employee/{id}")
	public String delete(@PathVariable Integer id)
	{
		System.out.println(id);
		empSer.delete(id);
		String body="delete successfully";
		return body;
		
	}
	
	@PutMapping("/employee")
	public String update(@RequestBody Employee emp)
	{
		System.out.println(emp);
		empSer.save(emp);
		
		String body="record updated";
		return body;
	}
	
	

}
