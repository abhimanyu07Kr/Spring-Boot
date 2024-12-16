package in.abhi;

import java.time.LocalDate;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="emp")
public class Employee {
	
	@Id
	@Column(name="empNo")
	private Integer empId;
	
	@Column(name="ename")
	private String empName;
	
	@Column(name="job")
	private String empDept;
	
	@Column(name="age")
	private Integer empAge;
	
	@Column(name="joinDate",updatable = false)
	@CreationTimestamp
	private LocalDate createdDate;
	
	@Column(name="updatedDetails",insertable = false)
	@UpdateTimestamp
	private LocalDate UpadtedDate;

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

	public Integer getEmpAge() {
		return empAge;
	}

	public void setEmpAge(Integer empAge) {
		this.empAge = empAge;
	}

	public LocalDate getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(LocalDate createdDate) {
		this.createdDate = createdDate;
	}

	public LocalDate getUpadtedDate() {
		return UpadtedDate;
	}

	public void setUpadtedDate(LocalDate upadtedDate) {
		UpadtedDate = upadtedDate;
	}

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", empDept=" + empDept + ", empAge=" + empAge
				+ ", createdDate=" + createdDate + ", UpadtedDate=" + UpadtedDate + "]";
	}
	
	
	

}

