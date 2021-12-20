package roulette;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Test;

public class IntervalleAdapterTest {
	@Test
	public void check_random_number_ok() throws Exception {
		
		//test
		IntervalleAdapter intervalleAdapter 
		int rslt = rouletteService.getRandomNumber();
		int rslt2 = rouletteService.getRandomNumber();
		//assert
		assertThat(rslt).isNotEqualTo(rslt2);
		
	}
}