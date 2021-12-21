package duplicationkata;

import java.util.function.Function;

public class Lesson3HigherOrderFunctions extends Song
{
  public void singCheers()
  {
    singRefrain(this::incremente, 0);
    
    sing("Who do we appreciate?");
    
    singRefrain(this::getNextPrime, 13);
    
    sing("These are the primes, that we find fine!");
  }
  
private void singRefrain(Function<Integer , Integer> fn ,int number) {
	
	number = singPart(fn, number);
    
    number = singPart(fn, number);
    
    number = singPart(fn, number);
    
    number = singPart(fn, number);
}

private int singPart(Function<Integer, Integer> fn, int number) {
	number = fn.apply(number);
	sing(number + "! ");
	return number;
}

private int incremente(int number) {
	return number + 2;
}
  private int getNextPrime(int number)
  {
    switch (number)
    {
      case 13 :
        return 17;
      case 17 :
        return 19;
      case 19 :
        return 23;
      case 23 :
        return 29;
    }
    return 0;
  }
}
