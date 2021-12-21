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
        for (String name : names) {
          singPart1(this::isStartWith, name, "Hip Hip Horray! For " + name);
        }
        break;
      case 2 :
        for (String name : names){
            singPart1(this::isContains, name, name.toUpperCase() + "! Yay " + name + "!");
        }
        break;
      case 3 :
        for (String name : names) {
          singPart2(name);
        }
        break;
    }
  }


private void singPart1(Function<String , Boolean> fn ,String name, String message) {
	if (fn.apply(name)) {
	    sing(message);
	  } else {
	    singPart2(name);
	  }
}


private void singPart2(String name) {
	sing("Hello " + name + ", it's nice to meet you.");
}

private boolean isStartWith(String name) {
	return name.startsWith("L");
}

private boolean isContains(String name) {
	return name.contains("a");
}

}
