package roulette;

import static org.junit.Assert.assertTrue;

import java.util.Random;

import org.assertj.core.api.Assertions;
import org.junit.Test;
import org.mockito.Mock;

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
