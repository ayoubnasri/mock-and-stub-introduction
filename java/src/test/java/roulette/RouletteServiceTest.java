package roulette;

import static org.assertj.core.api.Assertions.assertThat;

import java.security.NoSuchAlgorithmException;
import java.util.concurrent.TimeUnit;

import org.assertj.core.api.Assertions;
import org.junit.Test;
import org.mockito.Mockito;

public class RouletteServiceTest {
	
	
	
	TimeOutAdapter timeOutAdapter = Mockito.mock(TimeOutAdapter.class); 
	IntervalleAdapter  intervalleAdapter =  Mockito.mock(IntervalleAdapter.class);
	RouletteService rouletteService = new RouletteService(intervalleAdapter, timeOutAdapter);
	

	@Test
	public void check_random_number_in_interval() throws Exception {
		//setUp
		//test
		int rslt = rouletteService.getRandomNumber();
		//assert
		Assertions.assertThat(rslt).isBetween(0, 36);
	}
	
	@Test
	public void check_random_number_ok() throws Exception {
		//test
		int rslt = rouletteService.getRandomNumber();
		int rslt2 = rouletteService.getRandomNumber();
		//assert
		assertThat(rslt).isNotEqualTo(rslt2);
		
	}
	
	@Test
	public void testTimeOut() throws InterruptedException, NoSuchAlgorithmException {
		
		rouletteService.getRandomNumber();
		Mockito.verify(timeOutAdapter).getTimeOut();
	}
	
	@Test
	public void testIf_random_is_equal00() {
	
	}
		
	

}
