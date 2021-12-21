package duplicationkata;

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
private void singRefrain(int number) {
	sing(number + "! ");
    
    number = incrementeDeux(number);
    sing(number + "! ");
    
    number = incrementeDeux(number);
    sing(number + "! ");
    
    number = incrementeDeux(number);
    sing(number + "! ");
}
private int incrementeDeux(int number) {
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
