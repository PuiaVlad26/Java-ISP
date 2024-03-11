package isp.lab3;

import isp.lab3.exercise5.Exercise5;

import java.util.HashMap;
import java.util.Map;

public class VendingMachineTest {
    public static void main(String[] args) {
        Map<Integer, String> products = new HashMap<>();
        products.put(1, "CocaCola");
        products.put(2, "Pepsi");
        products.put(3, "Monster Energy");

        Exercise5 vendingMachine = new Exercise5(products);

        vendingMachine.userMenu();

    }
}

