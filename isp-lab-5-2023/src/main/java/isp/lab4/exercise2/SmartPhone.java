package isp.lab4.exercise2;

public class SmartPhone implements  Chargeable {
    private int baterryLevel;

    public SmartPhone(int baterryLevel) {
        this.baterryLevel = Math.max(Math.min(baterryLevel, 100), 0);
    }

    @Override
    public String toString() {
        return "SmartPhone{" +
                "baterryLevel=" + baterryLevel +
                '}';
    }
@Override
    public int getBatteryLevel() {
        return baterryLevel;
    }
@Override
    public void charge(int durration) {
        baterryLevel = Math.min(baterryLevel + 3 * durration, 100);
    }
}
