package ColocviuDrone;

public abstract class Drone {
    private String model;
    private double maximumFlightRange;

    public Drone(String model, double maximumFlightRange) {
        this.model = model;
        this.maximumFlightRange = maximumFlightRange;
    }

    public String getModel() {
        return model;
    }

    public double getMaximumFlightRange() {
        return maximumFlightRange;
    }

    public abstract void displayInfo();
}
