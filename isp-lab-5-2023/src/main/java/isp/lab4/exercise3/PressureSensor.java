package isp.lab4.exercise3;

public class PressureSensor extends  Sensor {
    private double presure;

    public PressureSensor(String installLocation, String name, double presure) {
        super(installLocation, name);
        this.presure = presure;
    }

    public double getPresure() {
        return presure;
    }

    @Override
    public String toString() {
        return "PressureSensor{" +
                "presure=" + presure +
                '}';
    }
}
