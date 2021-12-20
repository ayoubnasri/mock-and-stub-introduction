package roulette;

import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.util.Random;

public class RouletteService {	
	
	private TimeOutAdapter timeOutAdapter; 
	
	public RouletteService(TimeOutAdapter timeOutAdapter) {
		this.timeOutAdapter = timeOutAdapter;
	}
	
	public int getRandomNumber() throws NoSuchAlgorithmException, InterruptedException {

		timeOutAdapter.getTimeOut();
		Random rand = SecureRandom.getInstanceStrong(); 

		return rand.ints(1, 0, 36).findFirst().getAsInt();

	}

}
