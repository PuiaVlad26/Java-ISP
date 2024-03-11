package aut.isp.lab4.exercise5;

public class Alarm extends Actuator {

    public Alarm(String manufacturer, String model) {
        super(manufacturer, model);
    }

    public void turnOn() {

        System.out.println("Alarma a pornit");
    }

    public void turnOff() {
        System.out.println("Alarma s-a oprit");
    }

}
