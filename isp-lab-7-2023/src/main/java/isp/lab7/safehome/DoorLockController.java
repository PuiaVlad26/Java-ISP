package isp.lab7.safehome;

import java.util.Map;


public class DoorLockController implements ControllerInterface {

    private Map<Tenant, AccesKey> validAcces;
    private List<AccesLog> accesLogList;
    private Door door;
    private int trys;

    public DoorLockController( Map<Tenant, AccesKey> validAcces,List<AccesLog> accesLogList,
                              Door door, int trys){
        this.validAcces=validAcceskey;
        this.accesLogList=accesLogList;
        this.door=door;
        this.trys=0;
    }

    @Override

    public DoorStatus enterPin(String pin) throws Exception {
        return null;

    }

    @Override

    public void addTenant(String pin, String name) throws Exception {
        if (name == null || name.trim().isEmpty) {
            throw new EmptyTenantNameException();
        }
        Tenant tenant = new Tenant(name);
        AccesKey accesKey = new AccesKey(pin);
        if (validAcces.containsKey(tenant)) {
            throw new TenantAlreadyExistsException("Tentant already exist:" + name);

        } else {
            validAcces.put(tenant, accesKey);
        }
    }

    @Override

    public void removeTenant(String name) throws Exception {

        if (name == null || name.trim().isEmpty) {
            throw new EmptyTenantNameException();
        }
        Tenant tenant = new Tenant(name);
        if (validAcces.containsKey(tenant)) {
            throw new TenantAlreadyExistsException("Tentant already exist:" + name);

        } else {
//            validAcces.put(tenant, accesKey);
        }
    }

    @Override

    public List<AccesLog> getAccesLog() {
        return null;
    }
}
