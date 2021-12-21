package duplicationkata;

import java.util.Arrays;
import java.util.List;

public class Lesson1Straight extends Song
{
	
	List<String> refrains = Arrays.asList("But the cat came back", 
											"The very next day",
											"Oh the cat came back", 
											"We thought he was a goner",
											"But the cat came back, he just wouldn't go away");
	
	List<String> singPart = Arrays.asList("We gave the cat to a little kid","We sent the cat out on a boat");
	
  public void singCatSong()
  {
	  for(String s:singPart) {
		  singSong(s);
	  }
  }
  
	private void singSong(String s) {
		sing(s);
	    singRefrain();
	}

	private void singRefrain() {
		for (String r:refrains) {
			sing(r);
		}
	}
}
