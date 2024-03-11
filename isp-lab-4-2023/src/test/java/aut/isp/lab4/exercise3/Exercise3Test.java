package aut.isp.lab4.exercise3;

import org.junit.Test;

import static org.junit.Assert.*;

public class Exercise3Test {
    @Test
    public void Exercise3Test_toString() {
        Fishfeeder fishfeeder = new Fishfeeder("Lego", "Binchiling");
        AquariumController aquariumController = new AquariumController("Lego",
                "Binchiling", (float) 7.16, fishfeeder, (float) 7.30);
        assertEquals("AquariumController{manufacturer='Lego'," +
                " model='Binchiling', currentTime=7.16, feeder=Fishfeeder{manufacturer='Lego', " +
                "model='Binchiling', meals=14}, feedingTime=7.3}", aquariumController.toString());

    }
}
