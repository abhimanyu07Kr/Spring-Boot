package in.abhi;

import java.time.LocalDate;

import org.hibernate.annotations.CreationTimestamp;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Student {

	@Id
	private Integer StuId;
	private String stuName;
	
	@CreationTimestamp
	private LocalDate createdDate;

	public Integer getStuId() {
		return StuId;
	}

	public void setStuId(Integer stuId) {
		StuId = stuId;
	}

	public String getStuName() {
		return stuName;
	}

	public void setStuName(String stuName) {
		this.stuName = stuName;
	}

	public LocalDate getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(LocalDate createdDate) {
		this.createdDate = createdDate;
	}

	@Override
	public String toString() {
		return "Student [StuId=" + StuId + ", stuName=" + stuName + ", createdDate=" + createdDate + "]";
	}
	
	
}
