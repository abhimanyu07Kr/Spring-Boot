package in.abhi.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Phone {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer phoneId;
	private String phoneName;
	private Integer phoneRam;
	private Integer phoneRom;
	public Integer getPhoneId() {
		return phoneId;
	}
	public void setPhoneId(Integer phoneId) {
		this.phoneId = phoneId;
	}
	public String getPhoneName() {
		return phoneName;
	}
	public void setPhoneName(String phoneName) {
		this.phoneName = phoneName;
	}
	public Integer getPhoneRam() {
		return phoneRam;
	}
	public void setPhoneRam(Integer phoneRam) {
		this.phoneRam = phoneRam;
	}
	public Integer getPhoneRom() {
		return phoneRom;
	}
	public void setPhoneRom(Integer phoneRom) {
		this.phoneRom = phoneRom;
	}
	@Override
	public String toString() {
		return "Phone [phoneId=" + phoneId + ", phoneName=" + phoneName + ", phoneRam=" + phoneRam + ", phoneRom="
				+ phoneRom + "]";
	}
	
	
	
	

}
