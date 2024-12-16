package in.abhi.dao;

import java.util.List;

import in.abhi.entity.Phone;

public interface PhoneDao {
	
	public boolean save(Phone phone);
	
	public List<Phone> findAll();
	
	public void delete(Integer id);

}
