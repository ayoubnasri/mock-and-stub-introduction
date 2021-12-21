package duplicationkata;

import java.util.function.BiFunction;
import java.util.function.Function;

import org.apache.commons.lang3.StringUtils;

public class Lesson31 extends Song
{
  public void singSong(int style, String... names)
  {
    switch (style) {
      case 1 :
          singPart1(this::isStartWith, names, "Hip Hip Horray! For " + name);
        break;
      case 2 :
            singPart1(this::isContains, names, name.toUpperCase() + "! Yay " + name + "!");
        break;
      case 3 :
        	singPart1(this::isFalse, names, null);
        break;
    }
  }


private void singPart1(Function<String , Boolean> fn ,String... names, String message) {
	 for (String name : names) {
	if (fn.apply(name)) {
	    sing(message);
	  } else {
		  sing("Hello " + name + ", it's nice to meet you.");
	  }
	 }
}

private boolean isStartWith(String name) {
	return name.startsWith("L");
}

private boolean isContains(String name) {
	return name.contains("a");
}

private boolean isFalse(String name) {
	return false ; 
}

}
