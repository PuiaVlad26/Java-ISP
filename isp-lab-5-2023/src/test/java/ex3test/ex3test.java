package isp.lab4.exercise3;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class ex3test {
    @Test
    public void Exer3Test() {
        Sensor[] sensors = new Sensor[2];
        sensors[0] = new PressureSensor("Caminu 7", "Nufaru", 10);
        sensors[1] = new TemperatureSensor("Caminu 7", "Asus", 18);

        List<Sensor> sensorList = new ArrayList<>();

        sensorList.add(sensors[0]);
        sensorList.add(sensors[1]);

        MonitoringService monitoringService = new MonitoringService(sensorList);
        assertEquals(18.0, monitoringService.getAvarageTemperatureSensor(),0.0001);
        assertEquals(14.0,monitoringService.getAvarageAllSensor(),0.0001);
    }
}
