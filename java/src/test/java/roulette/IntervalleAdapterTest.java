package roulette;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Test;

public class IntervalleAdapterTest {
	@Test
	public void check_random_number_ok() throws Exception {
		
		//test
		IntervalleAdapter intervalleAdapter  = new IntervalleAdapter();
		int rslt = intervalleAdapter.getRandomValue();
		int rslt2 = intervalleAdapter.getRandomValue();
		//assert
		assertThat(rslt).isNotEqualTo(rslt2);
		
	}
}