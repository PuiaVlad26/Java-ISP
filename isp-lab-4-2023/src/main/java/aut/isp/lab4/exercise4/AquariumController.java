package aut.isp.lab4.exercise4;

import java.security.PublicKey;

public class AquariumController {

    //attributs
    private String manufacturer;
    private String model;
    private float currentTime;
    private Fishfeeder feeder;
    private float feedingTime;
    private float lightOnTime;
    private float lightsOffTime;

    //constructors
    public AquariumController(String manufacturer, String model, float currentTime,
                              Fishfeeder feeder, float feedingTime, float lightOnTime, float lightsOffTime ) {
        this.manufacturer = manufacturer;
        this.model = model;
        this.currentTime = currentTime;
        this.feeder = feeder;
        this.feedingTime = feedingTime;
        this.lightOnTime = lightOnTime;
        this.lightsOffTime = lightsOffTime;


    }

    //methods
    public void setCurrentTime(float currentTime) {
        this.currentTime = currentTime;
        if (this.feedingTime == currentTime)
            feeder.feed();
        if(currentTime >= lightOnTime && currentTime < lightsOffTime)
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

    public void setFeeder(Fishfeeder feeder) {
        this.feeder = feeder;
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

    public void setFeedingTime(float feedingTime) {

        this.feedingTime = feedingTime;
    }
}