package spring_01;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class UserService {
	@Autowired
	private PwdService pwdService;
	@Autowired
	private IUserDao iuserDao;
	@Autowired
	private EmailService emailService;
	
	void start(String name,String email,long phoneNo)
	{
		
		boolean b1=pwdService.encrypt();
		boolean b2=emailService.mail();
		boolean b3=iuserDao.userDao(name, email, phoneNo);
		if(b3) {
			
			 if (b1 && b2) {
				System.out.println("email sent.. \n "+name+"\n "+email+"\n "+phoneNo);
			}
		}
	}

}
