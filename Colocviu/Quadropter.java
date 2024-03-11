public class Quadcopter extends Drone {
    private int propellerCount;

    public Quadcopter(String model, double maximumFlightRange, int propellerCount) {
        super(model, maximumFlightRange);
        this.propellerCount = propellerCount;
    }

    @Override
    public void displayInfo() {
        System.out.println("Model: " + getModel());
        System.out.println("Maximum Flight Range: " + getMaximumFlightRange() + " kilometers");
        System.out.println("Propeller Count: " + propellerCount);
        System.out.println("Drone Type: Quadcopter");
    }
}

public class FixedWing extends Drone {
    private double wingspan;

    public FixedWing(String model, double maximumFlightRange, double wingspan) {
        super(model, maximumFlightRange);
        this.wingspan = wingspan;
    }

    @Override
    public void displayInfo() {
        System.out.println("Model: " + getModel());
        System.out.println("Maximum Flight Range: " + getMaximumFlightRange() + " kilometers");
        System.out.println("Wingspan: " + wingspan + " meters");
        System.out.println("Drone Type: Fixed Wing");
    }
}

public class Hexacopter extends Drone {
    private int propellerCount;

    public Hexacopter(String model, double maximumFlightRange, int propellerCount) {
        super(model, maximumFlightRange);
        this.propellerCount = propellerCount;
    }

    @Override
    public void displayInfo() {
        System.out.println("Model: " + getModel());
        System.out.println("Maximum Flight Range: " + getMaximumFlightRange() + " kilometers");
        System.out.println("Propeller Count: " + propellerCount);
        System.out.println("Drone Type: Hexacopter");
    }
}
