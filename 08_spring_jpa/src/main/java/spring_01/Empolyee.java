package spring_01;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Empolyee {

	@Id
	private Integer empId;
	private String empNmae;
	private double empSal;
	
//	public Empolyee(Integer empId, String empNmae, double empSal) {
//		
//		this.empId = empId;
//		this.empNmae = empNmae;
//		this.empSal = empSal;
//	}
//
	@Override
	public String toString() {
		return  empId + " " + empNmae + " " + empSal ;
	}
	
	
	
	
	public Integer getEmpId() {
		return empId;
	}
	public void setEmpId(Integer empId) {
		this.empId = empId;
	}
	public String getEmpNmae() {
		return empNmae;
	}
	public void setEmpNmae(String empNmae) {
		this.empNmae = empNmae;
	}
	public double getEmpSal() {
		return empSal;
	}
	public void setEmpSal(double empSal) {
		this.empSal = empSal;
	}
	
	
	
	
	
}
