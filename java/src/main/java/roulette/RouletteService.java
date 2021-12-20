package roulette;

import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.util.Random;
import java.util.concurrent.TimeUnit;

public class RouletteService {

	public int getRandomNumber() throws NoSuchAlgorithmException, InterruptedException {

		int timeout = 20;
		TimeUnit.SECONDS.sleep(timeout);
		Random rand = SecureRandom.getInstanceStrong(); 

		return rand.ints(1, 0, 36).findFirst().getAsInt();

	}

}
