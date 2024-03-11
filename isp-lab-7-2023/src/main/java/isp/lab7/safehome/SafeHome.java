package isp.lab7.safehome;

public class SafeHome {

    public static void main(String[] args) throws  Exception{
        ControllerInterface ctrl=new DoorLockController(new HashMap<>());
        ctrl.addTenant("1234","Marian");
        ctrl.addTenant("5677","Marcel");
        ctrl.remove("Marian");



    }
}
