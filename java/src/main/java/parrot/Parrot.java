package parrot;

public class Parrot {

    public Parrot() {
    }

    public double getSpeed() {
		return 0;
    	//throw new RuntimeException("Should be unreachable");
    }

    protected double getLoadFactor() {
        return 9.0;
    }

    protected double getBaseSpeed() {
        return 12.0;
    }

}
