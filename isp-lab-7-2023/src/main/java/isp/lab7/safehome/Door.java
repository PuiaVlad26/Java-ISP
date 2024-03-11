package isp.lab7.safehome;

public class Door {
    private DoorStatus status;
    private Tenant tenant;

    public Door(DoorStatus status, Tenant tenant) {
        this.status = status;
        this.tenant = tenant;
    }

    public void lockDoor() {
        this.status = Doorstatus.CLOSE;
    }

    public void unlockDoor() {
        this.status = Doorstatus.OPEN;
    }


}
