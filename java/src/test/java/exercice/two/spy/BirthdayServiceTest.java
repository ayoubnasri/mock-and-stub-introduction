package exercice.two.spy;

import static org.junit.Assert.*;

import org.junit.Test;
import org.mockito.Mockito;

import notification.Mailer;

public class BirthdayServiceTest {
	
	
	@Test
	public void testName() throws Exception {
		
		Mailer mailer = Mockito.mock(Mailer.class);
		
		Mockito.verify(mailer).send("Fred");
		
	}
	
  
  

}
