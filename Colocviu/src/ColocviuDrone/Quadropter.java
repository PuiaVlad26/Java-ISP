package ColocviuDrone;

 class Quadcopter extends Drone {
    private int quad;

    public Quadcopter(String model, double maximumFlightRange) {
        super(model, maximumFlightRange);
        this.quad = quad;
    }

    @Override
    public void displayInfo() {
        System.out.println("Model: " + getModel());
        System.out.println("Maximum Flight Range: " + getMaximumFlightRange() + " kilometers");
        System.out.println("Propeller Count: " + quad);
        System.out.println("Drone Type: Quadcopter");
    }
}

 class FixedWing extends Drone {
    private int wing;

    public FixedWing(String model, double maximumFlightRange) {
        super(model, maximumFlightRange);
        this.wing = wing;
    }

    @Override
    public void displayInfo() {
        System.out.println("Model: " + getModel());
        System.out.println("Maximum Flight Range: " + getMaximumFlightRange() + " kilometers");
        System.out.println("Wingspan: " + wing + " meters");
        System.out.println("Drone Type: Fixed Wing");
    }
}

class Hexacopter extends Drone {
    private int hexa;

    public Hexacopter(String model, double maximumFlightRange) {
        super(model, maximumFlightRange);
        this.hexa = hexa;
    }

    @Override
    public void displayInfo() {
        System.out.println("Model:" + getModel());
        System.out.println("Maximum Flight Range: " + getMaximumFlightRange() + " kilometers");
        System.out.println("Propeller Count: " + hexa);
        System.out.println("Drone Type: Hexacopter");
    }
}
