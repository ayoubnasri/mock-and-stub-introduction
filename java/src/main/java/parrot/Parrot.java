package parrot;

public class Parrot {

    private ParrotTypeEnum type;

    public Parrot() {
    }

    public double getSpeed() {
    	throw new RuntimeException("Should be unreachable");
    }

    protected double getLoadFactor() {
        return 9.0;
    }

    protected double getBaseSpeed() {
        return 12.0;
    }

}
