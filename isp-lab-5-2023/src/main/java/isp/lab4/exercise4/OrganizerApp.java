package isp.lab4.exercise4;

public class OrganizerApp {
    private TicketsManager ticketsManager;

    public OrganizerApp(TicketsManager ticketsManager) {
        this.ticketsManager = ticketsManager;
    }

    public void chekin(UserApp userApp) {
        int cod = userApp.viewTicket();
        boolean cod_valid = this.ticketsManager.validateTicket(cod);
        if (cod_valid) {
            System.out.println("Codul este valid");
        } else {
            System.out.println("Codul nu este valid");
        }
    }

}
