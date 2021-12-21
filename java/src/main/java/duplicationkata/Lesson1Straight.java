package duplicationkata;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Lesson1Straight extends Song
{
	
	List<String> refrains = Arrays.asList("But the cat came back","The very next day","Oh the cat came back", "We thought he was a goner","But the cat came back, he just wouldn't go away");
	
  public void singCatSong()
  {
    singSong();
    
    sing("We sent the cat out on a boat");
    
    singRefrain();
  }

private void singSong() {
	sing("We gave the cat to a little kid");
    
    singRefrain();
}

	private void singRefrain() {
		for (String r:refrains) {
			sing(r);
		}
	}
}
