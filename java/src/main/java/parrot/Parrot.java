package parrot;

public class Parrot {

    private ParrotTypeEnum type;

    public Parrot(ParrotTypeEnum type) {
        this.type = type;
    }

    public double getSpeed() {
        switch (type) {
            default:
                throw new RuntimeException("Should be unreachable");
        }
    }

    protected double getLoadFactor() {
        return 9.0;
    }

    protected double getBaseSpeed() {
        return 12.0;
    }

}
