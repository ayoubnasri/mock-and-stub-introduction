package parrot;

public class NorwegianParrot extends Parrot{

	public NorwegianParrot(double voltage, boolean isNailed) {
		super(null, voltage, isNailed);
	}
	public double getSpeed() {
        return (isNailed) ? 0 : getBaseSpeed(voltage);
	}
}
