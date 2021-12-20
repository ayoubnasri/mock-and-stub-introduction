package roulette;

import static org.junit.Assert.*;

import org.assertj.core.api.Assertions;
import org.junit.Test;

public class RouletteServiceTest {
	
	RouletteService rouletteService = new RouletteService();

	@Test
	public void check_random_number_ok() throws Exception {
		//setUp
		
		
		//test
		int rslt = rouletteService.getRandomNumber();
		
		//assert
		Assertions.assertThat(rslt).isBetween(0, 36);
	}
	
	@Test
	public void testName() throws Exception {
		
		
		//test
		
	}
	


}
