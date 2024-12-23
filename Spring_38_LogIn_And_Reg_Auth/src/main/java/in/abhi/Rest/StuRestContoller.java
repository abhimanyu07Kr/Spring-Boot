package in.abhi.Rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import in.abhi.Entity.Student;
import in.abhi.Repo.StuRepo;

@RestController
public class StuRestContoller {
	
	
	@Autowired
	private StuRepo stuRepo;
	
	@Autowired
	private PasswordEncoder passEnc;
	
	@Autowired
	private AuthenticationManager authManager;
	

	@PostMapping("/reg")
	public ResponseEntity<String> regCheck(@RequestBody Student stu)
	{
		stu.setStuPass(passEnc.encode(stu.getStuPass()));
		Student stuNo = stuRepo.findByStuNo(stu.getStuNo());
		if(stuNo==null) {
		stuRepo.save(stu);
		return new ResponseEntity<String>("Data saveed", HttpStatus.CREATED);
		}else {
			return new ResponseEntity<String>("Data not saved", HttpStatus.ALREADY_REPORTED);
		}
	}
	
	@PostMapping("/login")
	public ResponseEntity<String> loginCheck(@RequestBody Student stu)
	{
		UsernamePasswordAuthenticationToken token = new UsernamePasswordAuthenticationToken(stu.getStuName(), stu.getStuPass());
		try {
			Authentication auth = authManager.authenticate(token);
			if(auth.isAuthenticated())
			{
				return new ResponseEntity<String>("login Sucessful", HttpStatus.OK);
			}
		}catch(Exception e) {
			
		}
		return new ResponseEntity<String>("Invalid Credentials", HttpStatus.BAD_REQUEST);
	}
	
	
}

