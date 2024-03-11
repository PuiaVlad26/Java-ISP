package isp.lab10.raceapp;

import javax.swing.*;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Race!");
        CarRace carRace = new CarRace();
        JFrame frameCar = new JFrame("Semaphore");
        frameCar.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        SemaphorePanel semaphorePanel = new SemaphorePanel();

        frameCar.getContentPane().add(semaphorePanel);
        frameCar.pack();
        frameCar.setVisible(true);

        SemaphoreThread semaphoreThread = new SemaphoreThread(semaphorePanel);
        semaphoreThread.start();

        JFrame frame = new JFrame("Car Race");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        CarPanel carPanel = new CarPanel();

        frame.getContentPane().add(carPanel);
        frame.pack();
        frame.setSize(500, 300);
        frame.setVisible(true);

        Car car1 = new Car("Red car", carPanel);
        Car car2 = new Car("Blue car", carPanel);
        Car car3 = new Car("Green car", carPanel);
        Car car4 = new Car("Yellow car", carPanel);
        semaphoreThread.join();
        PlaySound playSound = new PlaySound();
        playSound.playSound();
        car1.start();
        car2.start();
        car3.start();
        car4.start();

        Timer timer = new Timer();
timer.start();


        car1.join();
        car2.join();
        car3.join();
        car4.join();
timer.pause();

        playSound.stopSound();

        Semaphore semaphore = new Semaphore();

    }

}
