package isp.lab10.exercise1;
import java.util.ArrayList;
import java.util.List;
public class ATC {
    private List<String> aircrafts;
    public ATC(){
        aircrafts = new ArrayList<>();
    }
    public void addAircraft(String id){
        Aircraft aircraft = new Aircraft("46",0);
aircrafts.add(id);

        System.out.println("Aircraft with id " + id + " added");
    }

    public void sendCommand(String id, AtcCommand command){

        System.out.println("Aircraft with id " + id + " received command " + command);
    }

    public void showAircrafts(){
        System.out.println("Display aircrfats.");
        Aircraft[] aircraftsList;
        for (String aircraft: aircrafts){
          //  System.out.println("Aircraft ID"+ aircraft.getID());
        }
    }
}

class AtcCommand {
    String command;

    public AtcCommand(String command) {
        this.command = command;
    }

    @Override
    public String toString() {
        return "AtcCommand{" +
                "command='" + command + '\'' +
                '}';
    }
    class Aircraft{
        private String id;

        public Aircraft(String id) {
            this.id = id;
        }

        @Override
        public String toString() {
            return "Aircraft{" +
                    "id='" + id + '\'' +
                    '}';
        }
    }
}
