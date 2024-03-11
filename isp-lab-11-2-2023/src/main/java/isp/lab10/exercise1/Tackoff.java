package isp.lab10.exercise1;

public class Tackoff {
   private int altitude;

    public Tackoff(int altitude) {
        this.altitude = altitude;
    }

    @Override
    public String toString() {
        return "Tackoff{" +
                "altitude=" + altitude +
                '}';
    }

    public int getAltitude() {
        return altitude;
    }

    public void setAltitude(int altitude) {
        this.altitude = altitude;
    }
}
