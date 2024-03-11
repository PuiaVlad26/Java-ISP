package isp.lab4.exercise3;

import java.util.ArrayList;
import java.util.List;

public class MonitoringService {
    private List<Sensor> sensors;

    public MonitoringService(List<Sensor> sensors) {
        this.sensors = sensors;
    }

    public MonitoringService() {
        sensors = new ArrayList<>();
    }

    public void AddSensor(Sensor sensor) {
        sensors.add(sensor);

    }

    public double getAvarageTemperatureSensor() {
        int num = 0;
        double sum = 0;
        for (Sensor sensor : sensors) {
            if (sensor instanceof TemperatureSensor) {
                TemperatureSensor temperatureSensor = (TemperatureSensor) sensor;
                sum = sum + temperatureSensor.getTemperature();
                num++;
            }

        }
        if (num > 0) {
            return sum / num;
        } else {
            return 0;
        }
    }

    public double getAvarageAllSensor() {
        int num = 0;
        double sum = 0;
        for (Sensor sensor : sensors) {
            if (sensor instanceof PressureSensor) {
                PressureSensor pressureSensor = (PressureSensor) sensor;
                sum = sum + pressureSensor.getPresure();
                num++;
            } else if (sensor instanceof TemperatureSensor) {
                TemperatureSensor temperatureSensor = (TemperatureSensor) sensor;
                sum = sum + temperatureSensor.getTemperature();
                num++;
            }


        }


        if (num > 0) {
            return sum / num;
        } else {
            return 0;
        }

    }
}


