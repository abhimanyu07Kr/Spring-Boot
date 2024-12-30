package in.abhi.RestTest;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.mock.web.MockHttpServletResponse;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.request.MockHttpServletRequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import in.abhi.Rest.AppRestController;
import in.abhi.Service.AppService;

@WebMvcTest(controllers = AppRestController.class)
public class AppControllerTest {

	@MockBean
	private AppService ser;
	
	@Autowired
	private MockMvc mvc;
	
	@Test
	public void getMsg() throws Exception
	{
		
		when(ser.getMsg()).thenReturn("dummy");
		MockHttpServletRequestBuilder mh = MockMvcRequestBuilders.get("/msg");
		MvcResult mvcResult = mvc.perform(mh).andReturn();
		MockHttpServletResponse response = mvcResult.getResponse();
		int status = response.getStatus();
		assertEquals(200,status);
	}
}
