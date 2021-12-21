package duplicationkata;

public class Lesson2Variable extends Song {
	
	  String refrain = " bottles of beer on the wall"; 
	  int[] bottlesNumber = {100,99};
	  
	  public void singBottlesOfBeer(){
		  for (int i : bottlesNumber) {
			  singRefrain(i);
		}
	  }

	private void singRefrain(int bottlesNumber) {
		String[] refrains = {
				bottlesNumber + refrain, 
				bottlesNumber + " bottles of beer" , 
				"Take one down, pass it around", 
				(bottlesNumber -1) + refrain};
		for (String ref : refrains) {
			sing(ref);
		}
	}
}
