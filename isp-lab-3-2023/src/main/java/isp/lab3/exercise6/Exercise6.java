package isp.lab3.exercise6;


import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

class VendingMachine {
    private static VendingMachine instance;
    private Map<Integer, String> products;
    private int credit;

    private VendingMachine(Map<Integer, String> products) {
        this.products = products;
        this.credit = 0;
    }

    public static synchronized VendingMachine getInstance() {
        if (instance == null) {
            Map<Integer, String> products = new HashMap<>();
            products.put(1, "CocaCola");
            products.put(2, "Pepsi");
            products.put(3, "Monster Energy");
            instance = new VendingMachine(products);
        }
        return instance;
    }

    public void displayProducts() {
        System.out.println("Produse disponibile:");
        for (Map.Entry<Integer, String> entry : products.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }

    public void insertCoin(int value) {
        this.credit += value;
        System.out.println("Introduceți " + value + " bani. Total credit: " + credit + " bani.");
    }

    public String selectProduct(int id) {
        String productName = products.get(id);
        if (productName != null) {
            int price = id * 10;
            if (credit >= price) {
                credit -= price;
                return "Achiziționat " + productName + ". Mulțumesc!";
            } else {
                return "Credit insuficient. Vă rog introduceți mai multe monede.";
            }
        } else {
            return "Produs invalid.";
        }
    }

    public void displayCredit() {
        System.out.println("Credit curent: " + credit + " bani.");
    }

    public void userMenu() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("\n1. Afișare produse\n2. Inserare monede\n3. Selectare produs\n4. Afișare credit\n5. Ieșire");
            System.out.print("Introduceți alegerea: ");
            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    displayProducts();
                    break;
                case 2:
                    System.out.print("Introduceți valoarea monedei: ");
                    int coinValue = scanner.nextInt();
                    insertCoin(coinValue);
                    break;
                case 3:
                    System.out.print("Introduceți produsul selectat: ");
                    int productSelection = scanner.nextInt();
                    String message = selectProduct(productSelection);
                    System.out.println(message);
                    break;
                case 4:
                    displayCredit();
                    break;
                case 5:
                    return;
                default:
                    System.out.println("Alegere invalidă. Vă rog încercați din nou.");
            }
        }
    }
}
