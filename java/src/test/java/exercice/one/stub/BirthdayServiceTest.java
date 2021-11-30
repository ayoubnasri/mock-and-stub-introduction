package exercice.one.stub;

import org.assertj.core.api.Assertions;
import org.junit.Test;
import org.mockito.Mockito;

import clients.ClientRepository;

public class BirthdayServiceTest {
	
	ClientRepository clientRepository = Mockito.mock(ClientRepository.class);
	BirthdayService service = new BirthdayService(clientRepository);
	
	@Test
	public void check_greeting_good_morning() throws Exception {
		
		//Test
		String result = service.greeting("fred");
		
		//assert
		Assertions.assertThat(result).isEqualTo("Good morning fred.");
		
	}
	
	@Test
	public void check_greeting_happy_birthday() throws Exception {
		Mockito.when(clientRepository.birthdayIsTodayFor("Alex")).thenReturn(true);
		
		//Test
		String result = service.greeting("Alex");
		
		//Assert
		Assertions.assertThat(result).isEqualTo("Happy birthday Alex!");
		
	}
  
  

}
