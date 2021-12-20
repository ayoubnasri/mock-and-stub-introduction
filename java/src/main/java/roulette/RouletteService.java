package roulette;

import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.util.Random;
import java.util.concurrent.TimeUnit;

public class RouletteService {	
	
	TimeOutAdapter timeOutAdapter; 
	
	public int getRandomNumber(int timeout) throws NoSuchAlgorithmException, InterruptedException {

		getTimeOut(timeout);
		Random rand = SecureRandom.getInstanceStrong(); 

		return rand.ints(1, 0, 36).findFirst().getAsInt();

	}

	private void getTimeOut(int timeout) throws InterruptedException {
		TimeUnit.SECONDS.sleep(timeout);
	}

}
