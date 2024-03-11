package isp.lab4.exercise3;

import java.util.ArrayList;
import java.util.List;
import java.util.List;

public class Exercise3 {
    public static void main(String[] args) {
        Sensor[] sensors = new Sensor[2];
        sensors[0] = new PressureSensor("Caminu 7", "Nufaru", 10);
        sensors[1] = new TemperatureSensor("Caminu 7", "Asus", 18);

        List<Sensor> sensorList = new ArrayList<>();

        sensorList.add(sensors[0]);
        sensorList.add(sensors[1]);

        MonitoringService monitoringService = new MonitoringService(sensorList);
        System.out.println(monitoringService.getAvarageTemperatureSensor());
        System.out.println(monitoringService.getAvarageAllSensor());
    }
}
