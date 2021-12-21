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
		
		String[] refrains = {i + refrain, i + " bottles of beer" , "Take one down, pass it around", (i -1) + refrain};
		
		for (String ref : refrains) {
			sing(ref);
		}
	}
}
