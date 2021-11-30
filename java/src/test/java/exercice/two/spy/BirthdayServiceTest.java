package exercice.two.spy;

import org.junit.Test;
import org.mockito.Mockito;

import clients.ClientRepository;
import exercice.one.stub.BirthdayService;
import notification.Mailer;

public class BirthdayServiceTest {
	
	ClientRepository clientRepository = Mockito.mock(ClientRepository.class);
	BirthdayService service = new BirthdayService(clientRepository);
	
	
	@Test
	public void testName() throws Exception {
		
		Mailer mailer = Mockito.mock(Mailer.class);
		
		service.greeting("Fred");
		
		Mockito.verify(mailer).send("Fred");
		
	}
	
  
  

}
