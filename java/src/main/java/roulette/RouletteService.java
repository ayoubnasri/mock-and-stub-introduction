package roulette;

import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.util.Random;

public class RouletteService {	
	
	TimeOutAdapter timeOutAdapter = new TimeOutAdapter(20); 
	
	public int getRandomNumber() throws NoSuchAlgorithmException, InterruptedException {

		timeOutAdapter.getTimeOut();
		Random rand = SecureRandom.getInstanceStrong(); 

		return rand.ints(1, 0, 36).findFirst().getAsInt();

	}

}
