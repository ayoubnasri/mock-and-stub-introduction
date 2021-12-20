package roulette;

import java.security.NoSuchAlgorithmException;

import org.assertj.core.api.Assertions;
import org.junit.Test;
import org.mockito.Mockito;

public class RouletteServiceTest {
	
	
	TimeOutAdapter timeOutAdapter = Mockito.mock(TimeOutAdapter.class); 
	IntervalleAdapter  intervalleAdapter =  Mockito.mock(IntervalleAdapter.class);
	RouletteService rouletteService = new RouletteService(intervalleAdapter, timeOutAdapter);
	
	@Test
	public void testTimeOut() throws InterruptedException, NoSuchAlgorithmException {
		rouletteService.getRandomNumber();
		Mockito.verify(timeOutAdapter).getTimeOut();
	}
	
	@Test
	public void testIf_random_is_equal00() throws NoSuchAlgorithmException, InterruptedException {
		Mockito.when(intervalleAdapter.getRandomValue()).thenReturn(37);
		Assertions.assertThat(rouletteService.getRandomNumber()).isEqualTo("00");
	}
		
	@Test
	public void testIf_random_is_not_equal00() throws NoSuchAlgorithmException, InterruptedException {
		Mockito.when(intervalleAdapter.getRandomValue()).thenReturn(10);
		Assertions.assertThat(rouletteService.getRandomNumber()).isNotEqualTo("00");
		Assertions.assertThat(rouletteService.getRandomNumber()).isEqualTo("10");
	}
	
	@Test
	public void testIf_color_is_red() throws NoSuchAlgorithmException, InterruptedException {
		Mockito.when(intervalleAdapter.getRandomValue()).thenReturn(4);
		Assertions.assertThat(rouletteService.getcolor()).isEqualTo("rouge");
	}

}
