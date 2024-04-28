package tcs.Security;



import org.springframework.stereotype.Component;

@Component
public class Security {
	public Security() {
		System.out.println();
		System.out.println("tcs Security::constructor");
		System.out.println();
		for(int i=0;i<=10;i++)
		{
			System.out.println(i*2);
		}
		System.out.println();
	}

}
