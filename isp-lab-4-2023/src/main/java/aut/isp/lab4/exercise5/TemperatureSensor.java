package aut.isp.lab4.exercise5;

public class TemperatureSensor extends Sensor {
    private int value;

    public TemperatureSensor(String manufacturer, String model) {
        super(manufacturer, model);
    }

    public void setValue(int value) {
        this.value = value;

    }
    @Override
        public float lgetValue(){
            return 0;
    }
    @Override
    public int tgetValue(){
        return this.value;
    }

}
