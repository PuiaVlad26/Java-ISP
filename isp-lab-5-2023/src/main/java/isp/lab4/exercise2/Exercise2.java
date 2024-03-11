package isp.lab4.exercise2;

public class Exercise2 {
    public static void main(String[] args) {
        Laptop laptop = new Laptop(10);
        SmartWatch smartWatch = new SmartWatch(0);
        SmartPhone smartPhone = new SmartPhone(69);
        laptop.charge(10);
        System.out.println("LAPTOP " + laptop.getBatteryLevel());
        smartWatch.charge(20);
        System.out.println("SMARTWATCH " + smartWatch.getBatteryLevel());
        smartPhone.charge(15);
        System.out.println("SMARTPHONE " + smartPhone.getBatteryLevel());
    }
}
