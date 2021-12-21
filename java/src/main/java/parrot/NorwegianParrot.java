package parrot;

public class NorwegianParrot extends Parrot{

    private boolean isNailed;
    private double voltage;
    
	public NorwegianParrot(double voltage, boolean isNailed) {
		super(null, voltage);
		this.isNailed = isNailed;
        this.voltage = voltage;

	}
	public double getSpeed() {
        return (isNailed) ? 0 : getBaseSpeed(voltage);
	}
}
