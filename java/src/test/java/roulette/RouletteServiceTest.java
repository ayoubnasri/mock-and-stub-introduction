package roulette;

import static org.assertj.core.api.Assertions.assertThat;

import java.security.NoSuchAlgorithmException;

import org.assertj.core.api.Assertions;
import org.junit.Test;
import org.mockito.Mockito;

public class RouletteServiceTest {
	
	
	TimeOutAdapter timeOutAdapter = Mockito.mock(TimeOutAdapter.class); 
	IntervalleAdapter  intervalleAdapter =  Mockito.mock(IntervalleAdapter.class);
	RouletteService rouletteService = new RouletteService(intervalleAdapter, timeOutAdapter);
	
	@Test
	public void testTimeOut() throws InterruptedException, NoSuchAlgorithmException {
		
		rouletteService.getRandomNumber();
		Mockito.verify(timeOutAdapter).getTimeOut();
	}
	
	@Test
	public void testIf_random_is_equal00() throws NoSuchAlgorithmException, InterruptedException {
		Mockito.when(intervalleAdapter.getRandomValue()).thenReturn(37);
		Assertions.assertThat(rouletteService.getRandomNumber()).isEqualTo("00");
		
		
	}
		
	

}
