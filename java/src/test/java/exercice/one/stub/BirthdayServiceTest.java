package exercice.one.stub;

import static org.mockito.Mockito.mock;

import org.assertj.core.api.Assertions;
import org.junit.Test;
import org.mockito.Mockito;

import clients.ClientRepository;

public class BirthdayServiceTest {
	
	ClientRepository clientRepository = mock(ClientRepository.class);
	BirthdayService service = new BirthdayService(clientRepository);
	
	@Test
	public void check_greeting_good_morning() throws Exception {
		
		//Test
		String greeting;
		
		if (service.repository.birthdayIsTodayFor("fred")) {
			greeting = "Happy birthday " + "fred" + "!";
		} else {
			greeting = "Good morning " + "fred" + ".";
		}
		String result = greeting;
		
		//assert
		Assertions.assertThat(result).isEqualTo("Good morning fred.");
		
	}
	
	@Test
	public void check_greeting_happy_birthday() throws Exception {
		//Setup
		Mockito.when(clientRepository.birthdayIsTodayFor("Alex")).thenReturn(true);
		String greeting;
		
		if (service.repository.birthdayIsTodayFor("Alex")) {
			greeting = "Happy birthday " + "Alex" + "!";
		} else {
			greeting = "Good morning " + "Alex" + ".";
		}
		
		//Test
		String result = greeting;
		
		//Assert
		Assertions.assertThat(result).isEqualTo("Happy birthday Alex!");
		
	}
  
  

}
