import java.util.concurrent.TimeUnit;

import org.assertj.core.api.Assertions;
import org.junit.Test;

public class TimeOutAdapterTest  {
	@Test
	public void check_random_number_reponse_time_ok() throws Exception {
		
		//setUp
		
		//Mockito.doReturn(20).when(timeOutAdapter).getTimeOut();
		timeOutAdapter = new TimeOutAdapter(20);
		//ReflectionTestUtils.setField(timeOutAdapter, "timeOutAdapter", new TimeOutAdapter(20));

		
		//test
		long currentTimeBefore = System.currentTimeMillis();
		int rslt = rouletteService.getRandomNumber();
		long currentTimeAfter = System.currentTimeMillis();
		

		//assert
		long diffTime = TimeUnit.MILLISECONDS.toSeconds(currentTimeAfter - currentTimeBefore);
		Assertions.assertThat(diffTime).isEqualTo(20);
		
	
	
	
	
	
	
	
	
	
	
	
	
	
}