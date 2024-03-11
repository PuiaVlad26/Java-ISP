package isp.lab4.exercise1;

public class Customer {
    private String customrld;
    private String name;
    private String phone;
    private Adress adress;

    public Customer(String customrld, String name, String phone, Adress adress) {
        this.customrld = customrld;
        this.name = name;
        this.phone = phone;
        this.adress = adress;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "customrld='" + customrld + '\'' +
                ", name='" + name + '\'' +
                ", phone='" + phone + '\'' +
                '}';
    }
}