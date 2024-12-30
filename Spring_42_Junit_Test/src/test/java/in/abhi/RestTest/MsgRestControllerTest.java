package in.abhi.RestTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import in.abhi.Rest.msgRestController;

public class MsgRestControllerTest {
	
	@Test
	public void getGreet()
	{
		
		msgRestController msg = new msgRestController();
		String greet = msg.getGreet();
		
		assertEquals("Good Morning", greet);
	}

}
