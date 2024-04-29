package spring_01;

import org.springframework.stereotype.Component;

@Component
public class PwdService {
	

	public boolean encrypt() {
		System.out.println("performing encrpytion algo");
		return true;
	}

}
