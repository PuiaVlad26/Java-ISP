package aut.isp.lab4.exercise4;

public class Exercise4 {
    public static void main(String[] args) {
        Fishfeeder fishfeeder = new Fishfeeder("Lego", "Binchiling");
        AquariumController aquariumController = new AquariumController("Lego",
                "Binchiling", (float) 7.16, fishfeeder, (float) 7.30, (float) 10, (float) 18);
        System.out.println(aquariumController.toString());
    }
}
