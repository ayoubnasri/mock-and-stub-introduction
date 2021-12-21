package duplicationkata;

public class Lesson2Variable extends Song
{
  public void singBottlesOfBeer()
  {
    singRefrain(100);
    singRefrain(99);
  }

private void singRefrain(int i1) {
	sing(i1 + " bottles of beer on the wall");
    sing(i1 + " bottles of beer");
    sing("Take one down, pass it around");  
    sing((i1 -1) +" bottles of beer on the wall");
}
}
