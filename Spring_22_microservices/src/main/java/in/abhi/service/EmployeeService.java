package in.abhi.service;

import java.util.List;

import org.springframework.stereotype.Service;

import in.abhi.entity.Employee;
import in.abhi.repo.EmployeeRepo;

@Service
public class EmployeeService {
	
	private EmployeeRepo empRepo;

	public EmployeeService(EmployeeRepo empRepo) {
		this.empRepo = empRepo;
		System.out.println("constructor : empService");
	}
	
	
	public List getAllStudent()
	{
		List<Employee> all = empRepo.findAll();
		return all;
	}
	
	
	
	public void save(Employee emp)
	{
		empRepo.save(emp);
	}
	
	public void delete(Integer empId)
	{
		empRepo.deleteById(empId);
	}
	
	
	
	

}
