package in.abhi.Service;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.abhi.Binding.Address;
import in.abhi.Binding.Employee;
import in.abhi.Repo.AddRepo;
import in.abhi.Repo.EmpRepo;

@Service
public class AppService {

	@Autowired
	private AddRepo addRepo;
	
	@Autowired
	private EmpRepo empRepo;
	
	
	public void save()
	{
		Employee e1 = new Employee();
		e1.setEmpName("abhi");
		e1.setEmpDept("cse");
		
		Address a1 = new Address();
		a1.setAddCity("ranchi");
		a1.setAddState("jharkhand");
		a1.setAddCountry("India");
		
		Address a2 = new Address();
		a2.setAddCity("bengaluru");
		a2.setAddCountry("India");
		a2.setAddState("karnatka");
		
		List<Address> list = Arrays.asList(a1,a2);
		
		e1.setAdd(list);
		a1.setEmp(e1);
		a2.setEmp(e1);
		
		empRepo.save(e1);
		
		
	}
	
	public void delete()
	{
		empRepo.deleteById(1);
	}
}
