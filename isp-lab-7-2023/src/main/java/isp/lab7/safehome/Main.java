package isp.lab7.safehome;

import java.util.HashMap;

public class Main {
    public static void main(String[] args){
        ControllerInterface ctrl = new DoorLockController(new HashMap<>());
        ctrl.addTenant("");
        ctrl.addTenant();
        ctrl.addTenant();
    }
}
