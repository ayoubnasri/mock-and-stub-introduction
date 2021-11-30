package exercice.one.stub;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.Assert.*;

import java.util.List;

import org.assertj.core.api.Assertions;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.internal.configuration.injection.scanner.MockScanner;

import clients.ClientRepository;

public class BirthdayServiceTest {
	
	
	
	@Test
	public void testName() throws Exception {
		
		ClientRepository clientRepository = Mockito.mock(ClientRepository.class);
		BirthdayService service = new BirthdayService(clientRepository);
		
		//Test
		
		String result = service.greeting("fred");
		
		Assertions.assertThat(result).isEqualTo("Good morning fred.");
		
	}
  
  

}
