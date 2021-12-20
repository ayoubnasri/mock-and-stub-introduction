package roulette;

import static org.junit.Assert.assertTrue;

import java.util.Random;

import org.assertj.core.api.Assertions;
import org.junit.Test;

public class RouletteServiceTest {
	
	RouletteService rouletteService; 

	@Test
	public void testName() throws Exception {
		//setUp
		
		//test

		int rslt = rouletteService.getRandomNumber();
		
		//assert
		Assertions.assertThat(rslt).isBetween(0, 36);
		
		
		
	}
	


}
