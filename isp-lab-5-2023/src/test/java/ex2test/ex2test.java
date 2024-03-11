package isp.lab4.exercise2;
import org.junit.Test;
import static org.junit.Assert.*;
public class ex2test {
    @Test
    public void Ex2TEST() {
        Laptop laptop = new Laptop(10);
        SmartWatch smartWatch = new SmartWatch(0);
        SmartPhone smartPhone = new SmartPhone(69);
        laptop.charge(10);
        assertEquals(20, laptop.getBatteryLevel());
        smartWatch.charge(20);
        assertEquals(40, smartWatch.getBatteryLevel());
        smartPhone.charge(15);
        assertEquals(100, smartPhone.getBatteryLevel());

    }
}
