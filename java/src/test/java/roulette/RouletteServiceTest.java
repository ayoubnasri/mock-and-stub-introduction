package roulette;

import org.assertj.core.api.Assertions;
import org.junit.Test;

public class RouletteServiceTest {
	
	

	@Test
	public void check_random_number_ok() throws Exception {
		//setUp
		RouletteService rouletteService = new RouletteService();
		
		//test
		int rslt = rouletteService.getRandomNumber();
		
		//assert
		Assertions.assertThat(rslt).isBetween(0, 36);
	}
	


}
