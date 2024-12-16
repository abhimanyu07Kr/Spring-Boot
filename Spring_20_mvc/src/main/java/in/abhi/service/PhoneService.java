package in.abhi.service;

import java.util.List;

import org.springframework.stereotype.Service;

import in.abhi.PhoneRepo;
import in.abhi.dao.PhoneDao;
import in.abhi.entity.Phone;

@Service
public class PhoneService implements PhoneDao{
	
	private PhoneRepo phoneRepo;

	public PhoneService(PhoneRepo phoneRepo) {
		this.phoneRepo = phoneRepo;
	}

	@Override
	public List<Phone> findAll() {
		
		return phoneRepo.findAll();
	}

	@Override
	public boolean save(Phone phone) {
		
		phoneRepo.save(phone);
		return true;
	}

	@Override
	public void delete(Integer id) {
		// TODO Auto-generated method stub
		phoneRepo.deleteById(id);
		
	}
	
	
	
	

	
	
	
	
	

}
