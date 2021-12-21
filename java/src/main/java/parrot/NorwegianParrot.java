package parrot;

public class NorwegianParrot extends Parrot{

    private boolean isNailed;
    private double voltage;
    
	public NorwegianParrot() {
		super(null);
		this.isNailed = isNailed;
        this.voltage = voltage;

	}
	public double getSpeed() {
        return (isNailed) ? 0 : getBaseSpeed(voltage);
	}
	
	private double getBaseSpeed(double voltage) {
        return Math.min(24.0, voltage * getBaseSpeed());
    }
}
