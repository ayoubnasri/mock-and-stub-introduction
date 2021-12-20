package roulette;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.concurrent.TimeUnit;

import org.assertj.core.api.Assertions;
import org.junit.Test;

public class RouletteServiceTest {
	
	RouletteService rouletteService = new RouletteService();

	@Test
	public void check_random_number_in_interval() throws Exception {
		//setUp
		
		//test
		int rslt = rouletteService.getRandomNumber(0);
		
		//assert
		Assertions.assertThat(rslt).isBetween(0, 36);
	}
	
	@Test
	public void check_random_number_ok() throws Exception {
		//test
		int rslt = rouletteService.getRandomNumber(0);
		int rslt2 = rouletteService.getRandomNumber(0);
		
		//assert
		assertThat(rslt).isNotEqualTo(rslt2);
		
	}
	
	@Test
	public void check_random_number_reponse_time_ok() throws Exception {
		
		//test
		long currentTimeBefore = System.currentTimeMillis();
		int rslt = rouletteService.getRandomNumber(20);
		long currentTimeAfter = System.currentTimeMillis();

		//assert
		long diffTime = TimeUnit.MILLISECONDS.toSeconds(currentTimeAfter - currentTimeBefore);
		Assertions.assertThat(diffTime).isEqualTo(20);
		
	}

}
