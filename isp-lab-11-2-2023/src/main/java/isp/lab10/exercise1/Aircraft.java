package isp.lab10.exercise1;

public class Aircraft {
    private String id;
    private int altitude;

    public Aircraft(String id, int altitude) {
        this.id = id;
        this.altitude = 0;
    }

    @Override
    public String toString() {
        return "Aircraft{" +
                "id='" + id + '\'' +
                ", altitude=" + altitude +
                '}';
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getAltitude() {
        return altitude;
    }

    public void setAltitude(int altitude) {
        this.altitude = altitude;
    }

}
