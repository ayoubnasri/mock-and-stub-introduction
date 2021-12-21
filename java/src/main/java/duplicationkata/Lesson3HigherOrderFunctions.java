package duplicationkata;

import java.util.function.BiFunction;

public class Lesson3HigherOrderFunctions extends Song
{
  public void singCheers()
  {
    int number = 2;
    singRefrain(number);
    
    sing("Who do we appreciate?");
    
    number = 17;
    sing(number + "! ");
    
    number = getNextPrime(number);
    sing(number + "! ");
    
    number = getNextPrime(number);
    sing(number + "! ");
    
    number = getNextPrime(number);
    sing(number + "! ");
    
    sing("These are the primes, that we find fine!");
  }
private void singRefrain(BiFunction<Integer, Integer> fn ,int number) {
	sing(number + "! ");
    
    number = incremente(number,2);
    sing(number + "! ");
    
    number = incremente(number);
    sing(number + "! ");
    
    number = incremente(number);
    sing(number + "! ");
}

private int incremente(int number, int incr) {
	return number + incr;
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
