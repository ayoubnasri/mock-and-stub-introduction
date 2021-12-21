package parrot;


public class AfricanParrot extends Parrot{

    private int numberOfCoconuts;

	public AfricanParrot(int numberOfCoconuts, double voltage, boolean isNailed) {
		super(null, voltage, isNailed);
        this.numberOfCoconuts = numberOfCoconuts;
	}

	@Override
	public double getSpeed() {
        return Math.max(0, getBaseSpeed() - getLoadFactor() * numberOfCoconuts);
	}
}