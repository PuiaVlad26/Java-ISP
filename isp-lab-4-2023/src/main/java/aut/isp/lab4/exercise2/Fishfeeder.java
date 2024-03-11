package aut.isp.lab4.exercise2;



public class Fishfeeder {


    private String manufacturer;
    private String model;
    private int meals;

    public Fishfeeder(String manufacturer, String model) {
        this.manufacturer = manufacturer;
        this.model = model;
        this.meals = 14;

    }

    public void filledUp() {
        this.meals = 14;
        System.out.println("Aparatul de dat mancare la pesti este la capacitate maxima");
    }

    public void feed() {
        if (meals > 0) {
            meals = meals - 1;
            System.out.println("Exista mancare" + meals + "mancare ramasa");
        } else {
            System.out.println("Aparatul este gol");
        }
    }

    @Override
    public String toString() {
        return "Fishfeeder{" +
                "manufacturer='" + manufacturer + '\'' +
                ", model='" + model + '\'' +
                ", meals=" + meals +
                '}';
    }

    public static void main(String[] args) {

    }
}