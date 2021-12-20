package roulette;

import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.util.Random;

public class RouletteService {

	public int getRandomNumber() throws NoSuchAlgorithmException, InterruptedException {


		wait(20*1000);
		Random rand = SecureRandom.getInstanceStrong(); 

		return rand.ints(1, 0, 36).findFirst().getAsInt();

	}

}
