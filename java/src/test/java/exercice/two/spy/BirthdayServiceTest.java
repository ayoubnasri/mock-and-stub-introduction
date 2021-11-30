package exercice.two.spy;

import org.junit.Test;
import org.mockito.Mockito;

import clients.ClientRepository;
import notification.Mailer;

public class BirthdayServiceTest {
	
	ClientRepository clientRepository = Mockito.mock(ClientRepository.class);
	Mailer mailer = Mockito.mock(Mailer.class);
	BirthdayService service = new BirthdayService(clientRepository,mailer);
	
	
	@Test
	public void check_greeting_good_morning() throws Exception {
		
		service.greeting("Fred");
		
		Mockito.verify(mailer).send("Good morning Fred.");
		
	}
	
	
	@Test
	public void check_greeting_happy_birthday() throws Exception {
		
		service.greeting("Fred");
		
		Mockito.verify(mailer).send("Good morning Fred.");
		
	}
	
  
  

}
