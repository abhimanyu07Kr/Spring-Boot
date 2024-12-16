package in.abhi;

import org.hibernate.annotations.GenericGenerator;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Student {
	
	@Id
	@GenericGenerator(strategy = "in.abhi.CustomGenerator",name="order_id_gen")
	@GeneratedValue(generator = "order_id_gen")
	private String stuId;
	private String stuName;
	private Integer stuage;
	
	
	
	
	public String getStuId() {
		return stuId;
	}
	public void setStuId(String stuId) {
		this.stuId = stuId;
	}
	public String getStuName() {
		return stuName;
	}
	public void setStuName(String stuName) {
		this.stuName = stuName;
	}
	public Integer getStuage() {
		return stuage;
	}
	public void setStuage(Integer stuage) {
		this.stuage = stuage;
	}
	@Override
	public String toString() {
		return "Student [stuId=" + stuId + ", stuName=" + stuName + ", stuage=" + stuage + "]";
	}
	
	

}
