package aut.isp.lab4.ex5;
import aut.isp.lab4.exercise5.*;
import org.junit.Test;

import static org.junit.Assert.*;

public class Exercise5Test {
    @Test
    public void testam() {

    LevelSensor lsensor = new LevelSensor("Filip SRL", "CD_AWY");
    TemperatureSensor tsensor = new TemperatureSensor("Filip SRL", "CD_AWY");

        lsensor.setValue(21);
        tsensor.setValue(23);

    Actuator Heater = new Heater("Filip SRL", "CD_AWY");
    Actuator Alarm = new Alarm("Filip SRL", "CD_AWY");
    Fishfeeder fishfeeder = new Fishfeeder("Filip SRL", "CD_AWY");
    AquariumController aquariumController = new AquariumController("Filip SRL", "CD_AWY",
            (float) 8.2, fishfeeder, (float) 8.2, (float) 8.5, (float) 9.0, (Sensor) tsensor, (Sensor) lsensor, Alarm, Heater);
    assertEquals(aquariumController.checkTemperature(), 23);
    }

}
