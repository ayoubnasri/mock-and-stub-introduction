package roulette;
import java.util.concurrent.TimeUnit;

import org.assertj.core.api.Assertions;
import org.junit.Test;

public class TimeOutAdapterTest  {
	@Test
	public void check_random_number_reponse_time_ok() throws Exception {
		
		//setUp
		
		TimeOutAdapter timeOutAdapter = new TimeOutAdapter(20);
		//test
		long currentTimeBefore = System.currentTimeMillis();
		timeOutAdapter.getTimeOut();
		long currentTimeAfter = System.currentTimeMillis();
		
		//assert
		long diffTime = TimeUnit.MILLISECONDS.toSeconds(currentTimeAfter - currentTimeBefore);
		Assertions.assertThat(diffTime).isEqualTo(20);
		
	
	}
	
	
	
	
	
	
}