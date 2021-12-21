package duplicationkata;

public class Lesson2Variable extends Song
{
  public void singBottlesOfBeer()
  {
    singRefrain(100);
    
    sing("99 bottles of beer on the wall");
    sing("99 bottles of beer");
    sing("Take one down, pass it around");
    sing("98 bottles of beer on the wall");
  }

private void singRefrain(int i1) {
	sing("100 bottles of beer on the wall");
    sing("100 bottles of beer");
    sing("Take one down, pass it around");  
    sing("99 bottles of beer on the wall");
}
}
