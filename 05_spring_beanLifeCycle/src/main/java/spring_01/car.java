package spring_01;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Component;
@Component
public class car implements InitializingBean, DisposableBean {

	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("car starting.....");

	}
	
	public void Drive()
	{
		System.out.println("happy journy........");
	}
	
	@Override
	public void destroy() throws Exception {
		System.out.println("car stopped.....");

	}

	

}
