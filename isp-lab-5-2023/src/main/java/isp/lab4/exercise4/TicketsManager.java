package isp.lab4.exercise4;

import java.util.ArrayList;
import java.util.Random;

public class TicketsManager {
    private Random  random = new Random();
    private ArrayList<Integer> validtickets = new ArrayList<Integer>();

    public int generatetickets(int money) {
        int ticket = 0;
        if (money >= 50) {
            ticket = (int) (1000 * this.random.nextInt());
            this.validtickets.add(new Integer(ticket));
        }
        return ticket;
    }

    public boolean validateTicket(int cod) {
        if (this.validtickets.contains(new Integer(cod))) {
            return true;
        } else return false;

    }


}

