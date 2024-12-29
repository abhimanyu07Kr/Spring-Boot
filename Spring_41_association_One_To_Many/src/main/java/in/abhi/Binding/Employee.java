package in.abhi.Binding;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class Employee {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer empId;
	private String empName;
	private String empDept;
	
	
	@OneToMany(mappedBy = "emp",cascade = CascadeType.ALL)
	private List<Address> add;


	public Integer getEmpId() {
		return empId;
	}


	public void setEmpId(Integer empId) {
		this.empId = empId;
	}


	public String getEmpName() {
		return empName;
	}


	public void setEmpName(String empName) {
		this.empName = empName;
	}


	public String getEmpDept() {
		return empDept;
	}


	public void setEmpDept(String empDept) {
		this.empDept = empDept;
	}


	public List<Address> getAdd() {
		return add;
	}


	public void setAdd(List<Address> add) {
		this.add = add;
	}
	
	
	
	

}
