
package spring_01;

import org.springframework.stereotype.Component;

@Component
public class data implements IUserDao {

	@Override
	public boolean userDao(String name, String email, long phoneNo) {
		System.out.println("data input successful ");
		return true;
	}

}
