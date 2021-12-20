package roulette;

import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.util.Random;

public class RouletteService {	
	
	private TimeOutAdapter timeOutAdapter; 
	
	public RouletteService(int min, int max) {
		this.min = min;
		this.max = max; 
	}
	private int min;
	private int max;
	
	public int getMin() {
		return min;
	}

	public void setMin(int min) {
		this.min = min;
	}

	public int getMax() {
		return max;
	}

	public void setMax(int max) {
		this.max = max;
	}

	public TimeOutAdapter getTimeOutAdapter() {
		return timeOutAdapter;
	}

	public void setTimeOutAdapter(TimeOutAdapter timeOutAdapter) {
		this.timeOutAdapter = timeOutAdapter;
	}

	public RouletteService(TimeOutAdapter timeOutAdapter) {
		this.timeOutAdapter = timeOutAdapter;
	}
	
	public int getRandomNumber() throws NoSuchAlgorithmException, InterruptedException {

		timeOutAdapter.getTimeOut();
		Random rand = SecureRandom.getInstanceStrong(); 
		return rand.ints(1, 0, 36).findFirst().getAsInt();

	}

}
