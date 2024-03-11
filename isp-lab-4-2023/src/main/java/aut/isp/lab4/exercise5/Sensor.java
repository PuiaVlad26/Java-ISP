package aut.isp.lab4.exercise5;

public abstract class Sensor {
    private String manufacturer;
private String model;

    public Sensor(String manufacturer, String model) {
        this.manufacturer = manufacturer;
        this.model = model;
    }

    @Override
    public String toString() {
        return "Sensor{" +
                "manufacturer='" + manufacturer + '\'' +
                ", model='" + model + '\'' +
                '}';
    }

    public abstract float lgetValue();
    public abstract int tgetValue();

}
