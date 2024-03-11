

package aut.isp.lab4.exercise4;

import org.junit.Test;

import static org.junit.Assert.*;

public class Exercise4Test {

    @Test
    public void ExerciseTest() {
        Fishfeeder fishfeeder = new Fishfeeder("Lego", "Binchiling");
        AquariumController aquariumController = new AquariumController("Lego",
                "Binchiling", (float) 7.16, fishfeeder, (float) 7.30, (float) 10, (float) 18);
        assertEquals("AquariumController{manufacturer='Lego', " +
                        "model='Binchiling', currentTime=7.16, feeder=Fishfeeder{manufacturer='Lego'," +
                        " model='Binchiling', meals=14}, feedingTime=7.3, lightOnTime=10.0, lightsOffTime=18.0}",
                aquariumController.toString());


    }

}
