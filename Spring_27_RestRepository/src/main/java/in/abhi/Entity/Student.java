package in.abhi.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Student {
	
	@Id
	Integer stuId;
	String stuName;
	Integer stuAge;
	public Integer getStuId() {
		return stuId;
	}
	public void setStuId(Integer stuId) {
		this.stuId = stuId;
	}
	public String getStuName() {
		return stuName;
	}
	public void setStuName(String stuName) {
		this.stuName = stuName;
	}
	public Integer getStuAge() {
		return stuAge;
	}
	public void setStuAge(Integer stuAge) {
		this.stuAge = stuAge;
	}
	
	
	
	

}
