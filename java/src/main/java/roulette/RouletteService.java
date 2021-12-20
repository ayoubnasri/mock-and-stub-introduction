package roulette;

import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.util.Random;
import java.util.concurrent.TimeUnit;

public class RouletteService {

	int timeout = 20;
	
	
	public int getRandomNumber() throws NoSuchAlgorithmException, InterruptedException {

		TimeUnit.SECONDS.sleep(timeout);
		Random rand = SecureRandom.getInstanceStrong(); 

		return rand.ints(1, 0, 36).findFirst().getAsInt();

	}

}
