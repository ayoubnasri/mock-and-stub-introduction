package duplicationkata;

public class Lesson2Variable extends Song
{
	
	  String refrain = " bottles of beer on the wall"; 
	  public void singBottlesOfBeer()
	  {
	    singRefrain(100);
	    singRefrain(99);
	  }

	private void singRefrain(int i) {
		sing(i + refrain);
	    sing(i + " bottles of beer");
	    sing("Take one down, pass it around");  
	    sing((i -1) + refrain);
	}
}
