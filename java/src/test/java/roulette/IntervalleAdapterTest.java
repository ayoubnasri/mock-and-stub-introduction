package roulette;

import static org.assertj.core.api.Assertions.assertThat;

import org.assertj.core.api.Assertions;
import org.junit.Test;

public class IntervalleAdapterTest {
	IntervalleAdapter intervalleAdapter  = new IntervalleAdapter();
	@Test
	public void check_random_number_ok() throws Exception {
		
		//test
		int rslt = intervalleAdapter.getRandomValue();
		int rslt2 = intervalleAdapter.getRandomValue();
		//assert
		assertThat(rslt).isNotEqualTo(rslt2);
		
	}
	
	@Test
	public void check_random_number_in_interval() throws Exception {
		//setUp
		//test
		int rslt = intervalleAdapter.getRandomValue();
		//assert
		Assertions.assertThat(rslt).isBetween(0, 36);
	}
	
}