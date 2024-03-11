package isp.lab4.exercise2;

public class SmartWatch implements Chargeable {
    private int baterryLevel;

    public SmartWatch(int baterryLevel) {
        this.baterryLevel = Math.max(Math.min(baterryLevel, 100), 0);
    }

    @Override
    public String toString() {
        return "SmartWatch{" +
                "baterryLevel=" + baterryLevel +
                '}';
    }
@Override
    public int getBatteryLevel() {
        return baterryLevel;
    }
@Override
    public void charge(int durration) {
        baterryLevel = Math.min(baterryLevel + 2 * durration, 100);

    }
}
