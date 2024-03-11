package aut.isp.lab4.exercise3;

public class AquariumController {

    //attributs
    private String manufacturer;
    private String model;
    private float currentTime;
    private Fishfeeder feeder;
    private float feedingTime;

    //constructors
    public AquariumController(String manufacturer, String model, float currentTime, Fishfeeder feeder, float feedingTime) {
        this.manufacturer = manufacturer;
        this.model = model;
        this.currentTime = currentTime;
        this.feeder = feeder;
        this.feedingTime = feedingTime;

    }

    //methods
    public void setCurrentTime(float currentTime) {
        this.currentTime = currentTime;
        if (this.feedingTime == currentTime)
            feeder.feed();
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
                '}';
    }

    public void setFeedingTime(float feedingTime) {
        this.feedingTime = feedingTime;
    }
}