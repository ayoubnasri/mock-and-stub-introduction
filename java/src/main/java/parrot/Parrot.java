package parrot;

public class Parrot {

    private ParrotTypeEnum type;
    private double voltage;

    public Parrot(ParrotTypeEnum type, double voltage) {
        this.type = type;
        this.voltage = voltage;
    }

    public double getSpeed() {
        switch (type) {
            default:
                throw new RuntimeException("Should be unreachable");
        }
    }

    private double getBaseSpeed(double voltage) {
        return Math.min(24.0, voltage * getBaseSpeed());
    }

    protected double getLoadFactor() {
        return 9.0;
    }

    protected double getBaseSpeed() {
        return 12.0;
    }

}
