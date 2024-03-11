package aut.isp.lab4.exercise5;

public class Heater extends Actuator {
    public Heater(String manufacturer, String model) {
        super(manufacturer, model);
    }

    public void turnOn() {

        System.out.println("Alarma a pornit");
    }

    public void turnOff() {
        System.out.println("Alarma s-a oprit");
    }

}

