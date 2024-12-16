package in.abhi.service;

import org.springframework.stereotype.Service;

import in.abhi.Address;
import in.abhi.Emp;
import in.abhi.Repo.AddRepo;
import in.abhi.Repo.EmpRepo;
import jakarta.transaction.Transactional;

@Service
public class EmpService {
	
	private EmpRepo empRepo;
	private AddRepo addRepo;

	public EmpService(EmpRepo empRepo,AddRepo addRepo) {
		this.empRepo = empRepo;
		this.addRepo = addRepo;
	}
	
	@Transactional(rollbackOn = Exception.class)
	public void save()
	{
		Emp e1 = new Emp();
		e1.setEmpAge(21);
		e1.setEmpName("abhi");
		 Emp e = empRepo.save(e1);
		
		Address a1 = new Address();
		
//		int n=10/0;
		
		a1.setCountry("india");
		a1.setDistic("giridih");
		a1.setState("jhar");
		a1.setEmp(e.getEmpId());
		
		addRepo.save(a1);
	}
	
	

}
