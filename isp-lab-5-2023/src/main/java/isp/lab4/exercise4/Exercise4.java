package isp.lab4.exercise4;

public class Exercise4 {
    public static void main(String[] args){
        TicketsManager ticketsManager = new TicketsManager();
        UserApp userApp = new UserApp(ticketsManager);
        userApp.buyticket();
        OrganizerApp organizerApp = new OrganizerApp(ticketsManager);
        organizerApp.chekin(userApp);
    }
}
