package in.abhi;

import java.time.LocalDate;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
public class Student {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer stuId;
	
	private String stuName;
	
	private String stuDept;
	
	private Integer stuAge;
	
	@CreationTimestamp
	@Column(updatable = false)
	private LocalDate createdDate;
	
	@UpdateTimestamp
	@Column(insertable = false)
	private LocalDate UpdatedDate;

	public Integer getStuId() {
		return stuId;
	}

	public String getStuName() {
		return stuName;
	}

	public void setStuName(String stuName) {
		this.stuName = stuName;
	}

	public String getStuDept() {
		return stuDept;
	}

	public void setStuDept(String stuDept) {
		this.stuDept = stuDept;
	}

	public Integer getStuAge() {
		return stuAge;
	}

	public void setStuAge(Integer stuAge) {
		this.stuAge = stuAge;
	}

	public LocalDate getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(LocalDate createdDate) {
		this.createdDate = createdDate;
	}

	@Override
	public String toString() {
		return "Student [stuId=" + stuId + ", stuName=" + stuName + ", stuDept=" + stuDept + ", stuAge=" + stuAge
				+ ", createdDate=" + createdDate + ", UpdatedDate=" + UpdatedDate + "]";
	}

	public LocalDate getUpdatedDate() {
		return UpdatedDate;
	}

	public void setUpdatedDate(LocalDate updatedDate) {
		UpdatedDate = updatedDate;
	}

	
	
}
