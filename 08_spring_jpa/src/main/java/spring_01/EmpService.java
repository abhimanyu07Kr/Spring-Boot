package spring_01;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

@Service
public class EmpService {
	
	private EmpRepo empRepo;

	public EmpService(EmpRepo empRepo) {
		this.empRepo = empRepo;
		
		System.out.println(empRepo.getClass());
	}
	
	
	
	
	
	public void saveEmp()
	{
		Empolyee em=new Empolyee();
		em.setEmpId(103);
		em.setEmpNmae("manu");
		em.setEmpSal(200.20);
		
		empRepo.save(em);
	}
	
	public void saveAll()
	{
		Empolyee em1=new Empolyee();
		
		em1.setEmpId(106);
		em1.setEmpNmae("rohan");
		em1.setEmpSal(1200.00);
		
		Empolyee em2=new Empolyee();
		em2.setEmpId(107);
		em2.setEmpNmae("jayant");
		em2.setEmpSal(28700.00);
		
		List<Empolyee> li=Arrays.asList(em1,em2);
		empRepo.saveAll(li);
		
	}
	
	public void show()
	{
		Iterable<Empolyee> i=empRepo.findAll();
		i.forEach(System.out::println);
	}
	
	public void getFindById()
	{
		 Optional<Empolyee> i2=empRepo.findById(101);
		 if(i2.isPresent())
		 {
			Empolyee emp=i2.get();
			System.out.println(emp);
		  }
	}
	
	public void getFindAllById()
	{
		List<Integer> ls=Arrays.asList(101,102);
		Iterable<Empolyee> i3=empRepo.findAllById(ls);
		i3.forEach(System.out::println);
	}
	
	public void getEmpByName(String name)
	{
	 	List<Empolyee> ls=empRepo.findByEmpNmae(name);
	 	ls.forEach(System.out::println);
	}
	
	public void getEmpSal(double data)
	{
		List<Empolyee> i=empRepo.findByEmpSal(data);
		i.forEach(System.out::println);
		
	}
	
	public void getEmpId(Integer i)
	{
		Empolyee i1=empRepo.findByEmpId(i);
		System.out.println(i1);
	}
	
	public void getEmpSalIsGrater(double amt)
	{
		List<Empolyee> i2= empRepo.findByEmpSalGreaterThanEqual(amt);
//	    System.err.println(i2);
		i2.forEach(System.out::println);
	}
	
	public void getAllRecord()
	{
		List<Empolyee> emp=empRepo.getAllEmpolyees();
		emp.forEach(System.out::println);
	}
	
	void getById(Integer i)
	{
		List<Empolyee> i3=empRepo.getEmpById(i);
//		System.out.println(i3);
		i3.forEach(System.out::println);
	}
	

	

}
