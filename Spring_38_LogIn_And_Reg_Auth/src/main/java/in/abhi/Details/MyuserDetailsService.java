package in.abhi.Details;

import java.util.Collections;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import in.abhi.Entity.Student;
import in.abhi.Repo.StuRepo;

@Service
public class MyuserDetailsService implements UserDetailsService{

	@Autowired
	private StuRepo stuRepo;
	
	
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		Student stuName = stuRepo.findByStuName(username);
		return new User(stuName.getStuName(),stuName.getStuPass(),Collections.EMPTY_LIST);
	}
	
	

}
