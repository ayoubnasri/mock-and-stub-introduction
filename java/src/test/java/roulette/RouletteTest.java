package roulette;

import java.util.Random;


import org.junit.jupiter.api.Assertions;
import org.junit.Test;

public class RouletteTest {
	

	@Test
	public void testName() throws Exception {
		//setUp
		
		//test
		Random r = new Random();
		int randomNumber = r.ints(1, 0, 37).findFirst().getAsInt();
		 Assertions.assertTrue("a".matches("a"));
		//assert
		
		
		
	}
	


}
