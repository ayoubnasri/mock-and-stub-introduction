package exercice.two.spy;

import notification.Mailer;
import org.assertj.core.api.Assertions;
import org.junit.Test;
import org.mockito.Mockito;

import clients.ClientRepository;

public class BirthdayServiceTest {
	
	ClientRepository clientRepository = Mockito.mock(ClientRepository.class);
	Mailer mailer = Mockito.mock(Mailer.class);
	BirthdayService service = new BirthdayService(clientRepository,mailer);
	
	
	@Test
	public void check_greeting_good_morning() throws Exception {
		
		//Test
		service.greeting("Fred");
		
		//Assert
		Mockito.verify(mailer).send("Good morning Fred.");
		
	}
	
	
	@Test
	public void check_greeting_happy_birthday() throws Exception {
		//Setup
		Mockito.when(clientRepository.birthdayIsTodayFor("Alex")).thenReturn(true);
		
		//Test
		service.greeting("Alex");
		
		//Assert
		Mockito.verify(mailer).send("Happy birthday Alex!");
		
	}
	
	@Test
	public void greeting_good_morning() throws Exception {

        FakeMailer fakeMailer = new FakeMailer();

        Mockito.when(clientRepository.birthdayIsTodayFor("Alex")).thenReturn(true);
        BirthdayService service = new BirthdayService(clientRepository, fakeMailer);

        //Test
        service.greeting("Alex");

        Assertions.assertThat(fakeMailer.sentMessage).isEqualTo("Happy birthday Alex!");
		
	}
	
	@Test
	public void check_birthdayIsTodayFor() throws Exception {
		//Setup
		FakeClientRepository fakeClientRepository = new FakeClientRepository();
		fakeClientRepository.setBirthdayFor("Alex");
		BirthdayService service = new BirthdayService(fakeClientRepository, mailer); 
		
		//Test
		service.greeting("Alex");
		
		//Assert
		Assertions.assertThat(fakeClientRepository.birthdayIsTodayFor("Alex")).isTrue();
		Mockito.verify(mailer).send("Happy birthday Alex!");
	}
	
  
  

}
