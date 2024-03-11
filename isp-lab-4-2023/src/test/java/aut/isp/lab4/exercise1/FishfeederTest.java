package aut.isp.lab4.exercise1;

import aut.isp.lab4.exercise2.Fishfeeder;
import org.junit.Test;

import static org.junit.Assert.*;

public class FishfeederTest {

    @Test
    public void FishTest() {
        Fishfeeder fishfeeder = new Fishfeeder("abc", "bcs,");
        assertEquals("Fishfeeder{manufacturer='abc', model='bcs,', meals=14}", fishfeeder.toString());


    }

}

