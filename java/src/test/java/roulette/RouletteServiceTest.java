package roulette;

import static org.junit.Assert.assertTrue;

import java.util.Random;

import org.assertj.core.api.Assertions;
import org.junit.Test;
import org.mockito.Mock;

public class RouletteServiceTest {
	
	@Mock
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
