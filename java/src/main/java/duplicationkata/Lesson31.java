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
          singPart(StringUtils::startsWith, name);
        }
        break;
      case 2 :
        for (String name : names){
          if (name.contains("a")) {
            sing(name.toUpperCase() + "! Yay " + name + "!");
          } else {
            sing("Hello " + name + ", it's nice to meet you.");
          }
        }
        break;
      case 3 :
        for (String name : names) {
          sing("Hello " + name + ", it's nice to meet you.");
        }
        break;
    }
  }

private void singPart(BiFunction<String, String , Boolean> fn ,String name, String message) {
	if (isStartWith(name, "L")) {
	    sing("Hip Hip Horray! For " + name);
	  } else {
	    sing("Hello " + name + ", it's nice to meet you.");
	  }
}

private boolean isStartWith(String name, String start) {
	return name.startsWith(start);
}
}
