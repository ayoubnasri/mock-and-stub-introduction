package roulette;

import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.util.Random;

public class IntervalleAdapter {
	
	private int getRandomValue() throws NoSuchAlgorithmException {
		Random rand = SecureRandom.getInstanceStrong(); 
		return rand.ints(1, 0, 36).findFirst().getAsInt();
	}

}
