package aut.isp.lab4.exercise5;

public class Actuator {
    private String manufacturer;
    private String model;

    public Actuator(String manufacturer, String model) {
        this.manufacturer = manufacturer;
        this.model = model;
    }

    @Override
    public String toString() {
        return "Actuator{" +
                "manufacturer='" + manufacturer + '\'' +
                ", model='" + model + '\'' +
                '}';
    }
    public void turnOn(){
        System.out.println("Alarma a pornit");
    }
    public void turnOff(){
        System.out.println("Alarma s-a oprit");
    }

}

