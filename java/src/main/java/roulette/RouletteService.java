package roulette;

import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.util.Random;
import java.util.concurrent.TimeUnit;

public class RouletteService {	
	
	public int getRandomNumber(int timeout) throws NoSuchAlgorithmException, InterruptedException {

		TimeUnit.SECONDS.sleep(timeout);
		Random rand = SecureRandom.getInstanceStrong(); 

		return rand.ints(1, 0, 36).findFirst().getAsInt();

	}

}
