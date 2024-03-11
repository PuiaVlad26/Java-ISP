package aut.isp.lab4.exercise5;


import java.security.PrivateKey;
import java.security.PrivilegedAction;

public class AquariumController {

    //attributs
    private String manufacturer;
    private String model;
    private float currentTime;
    private Fishfeeder feeder;
    private float feedingTime;
    private float lightOnTime;
    private float lightsOffTime;
    private int temperature;
    private Sensor tsensor;
    private Sensor lsensor;
    private Actuator alarm;
    private Actuator heater;

    //constructors
    public AquariumController(String manufacturer, String model, float currentTime,
                              Fishfeeder feeder, float feedingTime, float lightOnTime,
                              float lightsOffTime, Sensor tsensor,
                              Sensor lsensor, Actuator alarm, Actuator heater) {
        this.manufacturer = manufacturer;
        this.model = model;
        this.currentTime = currentTime;
        this.feeder = feeder;
        this.feedingTime = feedingTime;
        this.lightOnTime = lightOnTime;
        this.lightsOffTime = lightsOffTime;
        this.tsensor = tsensor;
        this.lsensor = lsensor;
        this.alarm = alarm;
        this.heater = heater;


    }

    //methods
    public void setCurrentTime(float currentTime) {
        this.currentTime = currentTime;
        if (this.feedingTime == currentTime)
            feeder.feed();
        if (currentTime >= lightOnTime && currentTime < lightsOffTime)
            System.out.println("LightOn");
        else
            System.out.println("LightOff");
    }

    public float getCurrentTime() {

        return this.currentTime;
    }

    public Fishfeeder getFeeder() {
        return feeder;
    }


    @Override
    public String toString() {
        return "AquariumController{" +
                "manufacturer='" + manufacturer + '\'' +
                ", model='" + model + '\'' +
                ", currentTime=" + currentTime +
                ", feeder=" + feeder +
                ", feedingTime=" + feedingTime +
                ", lightOnTime=" + lightOnTime +
                ", lightsOffTime=" + lightsOffTime +
                '}';
    }

    public int checkTemperature() {
        int temp = this.tsensor.tgetValue();
        System.out.println(temp);
        if (temp < 24) {
            this.heater.turnOn();
        } else if (temp > 27) {
            this.heater.turnOff();
        }
    if(temp<21){
        this.alarm.turnOn();
    }
    else {
        this.alarm.turnOff();
    }
    return temp;
    }

    public void checkWater() {
        this.lsensor.lgetValue();

    }

    public void setFeedingTime(float feedingTime) {

        this.feedingTime = feedingTime;
    }
}