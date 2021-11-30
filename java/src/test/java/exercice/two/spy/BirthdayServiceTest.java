package exercice.two.spy;

import org.junit.Test;
import org.mockito.Mockito;

import clients.ClientRepository;
import exercice.one.stub.BirthdayService;
import notification.Mailer;

public class BirthdayServiceTest {
	
	ClientRepository clientRepository = Mockito.mock(ClientRepository.class);
	Mailer mailer = Mockito.mock(Mailer.class);
	BirthdayService service = new BirthdayService(clientRepository,mailer);
	
	
	@Test
	public void testName() throws Exception {
		
		
		
		service.greeting("Fred");
		
		Mockito.verify(mailer).send("Fred");
		
	}
	
  
  

}
