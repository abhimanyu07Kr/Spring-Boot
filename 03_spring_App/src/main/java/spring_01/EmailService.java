package spring_01;

import org.springframework.stereotype.Component;

@Component
public class EmailService {
		public boolean mail()
		{
			System.out.println("performing mail service");
			return true;
		}
}
