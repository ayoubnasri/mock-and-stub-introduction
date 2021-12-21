package duplicationkata;

import java.util.ArrayList;
import java.util.List;

public class Lesson1Straight extends Song
{
	
	List<String> listText = new ArrayList();
	
  public void singCatSong()
  {
    sing("We gave the cat to a little kid");
    
    singRefrain();
    
    sing("We sent the cat out on a boat");
    
    singRefrain();
  }

private void singRefrain() {
	sing("But the cat came back");
    sing("The very next day");
    sing("Oh the cat came back");
    sing("We thought he was a goner");
    sing("But the cat came back, he just wouldn't go away");
}
}
