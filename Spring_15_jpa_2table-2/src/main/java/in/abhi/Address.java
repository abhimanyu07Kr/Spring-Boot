package in.abhi;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
public class Address {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer addId;
	private String distic;
	private String state;
	private String country;
	
	private Integer empId;

	public Integer getAddId() {
		return addId;
	}

	public void setAddId(Integer addId) {
		this.addId = addId;
	}

	public String getDistic() {
		return distic;
	}

	public void setDistic(String distic) {
		this.distic = distic;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public Integer getEmp() {
		return empId;
	}

	public void setEmp(Integer empId) {
		this.empId = empId;
	}

	@Override
	public String toString() {
		return "Address [addId=" + addId + ", distic=" + distic + ", state=" + state + ", country=" + country + ", emp="
				+ empId + "]";
	}

	

	
	
	

}
