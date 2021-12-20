package roulette;

import java.util.Random;

public class RouletteService {

	public int getRandomNumber() {
<<<<<<< HEAD
		
		Random r = new Random();
=======
		Random r = new Random();

<<<<<<< HEAD
		return r.ints(1, 0, 36).findFirst().getAsInt();
=======
>>>>>>> b56023a8c24fd7b4582e069aefcc56cc11f5356b
		int randomNumber = r.ints(1, 0, 36).findFirst().getAsInt();

		return randomNumber;
>>>>>>> 61e272385ad9b8182602cecd5e1ed66e0d800d43
	}

}
