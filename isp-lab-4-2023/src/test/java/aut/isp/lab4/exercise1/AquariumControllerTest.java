
package aut.isp.lab4.exercise1;

import static org.junit.Assert.*;

import org.junit.Test;

public class AquariumControllerTest {
    //implement minimal tests
    @Test
    public static void main(String[] args) {
        AquariumController fish = new AquariumController("Poseidon", "Nemo", (float) 1.18);
        assertEquals("Poseidon; Model:Nemo; Current Time:1.18", fish.toString());

    }
}