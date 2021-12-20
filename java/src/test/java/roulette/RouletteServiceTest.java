package roulette;

import static org.assertj.core.api.Assertions.assertThat;

import java.security.NoSuchAlgorithmException;
import java.util.concurrent.TimeUnit;

import org.assertj.core.api.Assertions;
import org.junit.Test;
import org.mockito.Mockito;

public class RouletteServiceTest {
	
	
	
	TimeOutAdapter timeOutAdapter = Mockito.mock(TimeOutAdapter.class); 
	RouletteService rouletteService = new RouletteService(timeOutAdapter);
	

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
	public void check_random_number_reponse_time_ok() throws Exception {
		
		//setUp
		
		//Mockito.doReturn(20).when(timeOutAdapter).getTimeOut();
		timeOutAdapter = new TimeOutAdapter(20);
		//ReflectionTestUtils.setField(timeOutAdapter, "timeOutAdapter", new TimeOutAdapter(20));

		
		//test
		long currentTimeBefore = System.currentTimeMillis();
		int rslt = rouletteService.getRandomNumber();
		long currentTimeAfter = System.currentTimeMillis();
		

		//assert
		long diffTime = TimeUnit.MILLISECONDS.toSeconds(currentTimeAfter - currentTimeBefore);
		Assertions.assertThat(diffTime).isEqualTo(20);
		
	}
	@Test
	public void testTimeOut() throws InterruptedException, NoSuchAlgorithmException {
		
		int rslt = rouletteService.getRandomNumber();
		Mockito.verify(timeOutAdapter).getTimeOut();
	}

}
