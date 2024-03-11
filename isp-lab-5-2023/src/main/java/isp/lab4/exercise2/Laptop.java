package isp.lab4.exercise2;

public class Laptop implements Chargeable {
    private int baterryLevel;

    public Laptop(int baterryLevel) {
        this.baterryLevel = Math.max(Math.min(baterryLevel, 100), 0);
    }

    @Override
    public String toString() {
        return "Laptop{" +
                "baterryLevel=" + baterryLevel +
                '}';
    }

    @Override
    public int getBatteryLevel(){
        return baterryLevel;
    }

    @Override
    public void charge(int durration) {
        baterryLevel = Math.min(baterryLevel + durration, 100);

    }
}
