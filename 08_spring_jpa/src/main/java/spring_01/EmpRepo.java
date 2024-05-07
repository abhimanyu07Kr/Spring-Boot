package spring_01;
import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

public interface EmpRepo extends CrudRepository<Empolyee,Integer> {
	
	@Query("from Empolyee")
	public List<Empolyee> getAllEmpolyees();
	
	@Query("from Empolyee where empId= id")
	public List<Empolyee> getEmpById(Integer id);
	
	//select*from empolyee emp_Name=name;
	public List<Empolyee>  findByEmpNmae(String empNmae);
	
	// select*from empolyee emp_sal=sal;
	public List<Empolyee>  findByEmpSal(double empSal);
	
	//select*from empolyee emp_Id=id;
	public Empolyee  findByEmpId(Integer empId); 
	
	// select*from empolyee where emp_sal<=sal;
	public List<Empolyee>  findByEmpSalGreaterThanEqual(double empSal);
	
	

}
