package parrot;


public class AfricanParrot extends Parrot{

    private int numberOfCoconuts;

	public AfricanParrot(int numberOfCoconuts) {
        this.numberOfCoconuts = numberOfCoconuts;
	}

	@Override
	public double getSpeed() {
        return Math.max(0, BASE_SPEED - LOAD_FACTOR * numberOfCoconuts);
	}
}
