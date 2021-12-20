package roulette;

import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.util.Random;

public class RouletteService {	
	
	TimeOutAdapter timeOutAdapter; 
	
	public int getRandomNumber(int timeout) throws NoSuchAlgorithmException, InterruptedException {

		timeOutAdapter.getTimeOut(timeout);
		Random rand = SecureRandom.getInstanceStrong(); 

		return rand.ints(1, 0, 36).findFirst().getAsInt();

	}

}
