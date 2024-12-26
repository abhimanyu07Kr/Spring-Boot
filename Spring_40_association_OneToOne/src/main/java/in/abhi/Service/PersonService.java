package in.abhi.Service;

import java.time.LocalDate;
import org.springframework.stereotype.Service;

import in.abhi.Entity.Passport;
import in.abhi.Entity.Person;
import in.abhi.Repo.PersonRepo;

@Service
public class PersonService {

	
	private PersonRepo perRepo;

	public PersonService(PersonRepo perRepo) {
		this.perRepo = perRepo;
	}
	
	
	public void saveEntity()
	{
		
		Passport pass1 = new Passport();
		pass1.setPassportNum(101);
		pass1.setExpDate(LocalDate.now());
		pass1.setIssuedDate(LocalDate.now());
		
		Person per1 = new Person();
		per1.setGender("male");
		per1.setName("Abhimanyu");
		per1.setPassport(pass1);
		pass1.setPerson(per1);
		
		perRepo.save(per1);
	}
	
	
}
