package parrot;

public class NorwegianParrot extends Parrot{

    private boolean isNailed;
    
	public NorwegianParrot(double voltage, boolean isNailed) {
		super(null, voltage);
		this.isNailed = isNailed;
	}
	public double getSpeed() {
        return (isNailed) ? 0 : getBaseSpeed(voltage);
	}
}
