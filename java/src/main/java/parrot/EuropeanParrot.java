package parrot;

public class EuropeanParrot extends Parrot{

	public EuropeanParrot() {
		super(null);
	}

	@Override
	public double getSpeed() {
		return getBaseSpeed();
	}

}
