package duplicationkata;

import java.util.function.Function;

public class Lesson31 extends Song {
    public void singSong(int style, String... names) {
        switch (style) {
            case 1:
                for (String name : names) {
                    String message = "Hip Hip Horray! For " + name;
                    singPart(this::isStartWith, name, message);
                }
                break;
            case 2:
                for (String name : names) {
                    String message = name.toUpperCase() + "! Yay " + name + "!";
                    singPart(this::isContains, name, message);
                }
                break;
            case 3:
                for (String name : names) {
                    singPart(this::isFalse, name, null);
                }
                break;
        }
    }


    private void singPart(Function<String, Boolean> fn, String name, String message) {
        if (fn.apply(name)) {
            sing(message);
        } else {
            sing("Hello " + name + ", it's nice to meet you.");
        }
    }

    private boolean isStartWith(String name) {
        return name.startsWith("L");
    }

    private boolean isContains(String name) {
        return name.contains("a");
    }

    private boolean isFalse(String name) {
        return false;
    }

}
