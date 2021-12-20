package roulette;

import java.util.Random;

public class RouletteService {

	public int getRandomNumber() {
		
		Random r = new Random();
		int randomNumber = r.ints(1, 0, 36).findFirst().getAsInt();

		return randomNumber;
	}

}
