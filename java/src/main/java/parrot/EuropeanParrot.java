package parrot;

public class EuropeanParrot extends Parrot{

	public EuropeanParrot(double voltage, boolean isNailed) {
		super(null, 0, voltage, isNailed);
	}

	@Override
	public double getSpeed() {
		return getBaseSpeed();
	}

}
