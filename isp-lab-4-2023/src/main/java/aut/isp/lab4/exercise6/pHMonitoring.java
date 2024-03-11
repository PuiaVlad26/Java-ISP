package aut.isp.lab4.exercise6;

public class pHMonitoring {
    private double pHValue;
    private final double acceptatMin = 6.5;
    private final double acceptatMax = 7.5;

    public void FishTank() {
        pHValue = 7.0;
    }

    public void checkPH() {
        if (pHValue < acceptatMin || pHValue > acceptatMax) {
            System.out.println("pH level nu e bun!");

        } else {
            System.out.println("pH level e bun.");
        }
    }