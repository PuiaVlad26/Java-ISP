package Drone;

public class Quadcopter extends Drone {
    private int propellerCount;

    public Quadcopter(String model, double maximumFlightRange) {
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

class FixedWing extends Drone {
    private double wingspan;

    public FixedWing(String model, double maximumFlightRange) {
        super();
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

class Hexacopter extends Drone {
    private int propellerCount;

    public Hexacopter(String model, double maximumFlightRange) {
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
