package isp.lab4.exercise4;

public class UserApp {
    private int TicketOK = 0;
    private int money = 400;
    private TicketsManager ticketsManager;

    public UserApp(TicketsManager ticketsManager) {
        this.ticketsManager = ticketsManager;
    }

    public void buyticket() {
        if (money > 50) {
            this.TicketOK = ticketsManager.generatetickets(50);
            this.money -=50;
            System.out.println("Userul a cumparat bilet cu codul:"+this.TicketOK);
        }


    }

    public int viewTicket() {
        return this.TicketOK;
    }
}
