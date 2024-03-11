package aut.isp.lab4.exercise3;

public class Exercise3 {
    public static void main(String[] args) {
        Fishfeeder fishfeeder = new Fishfeeder("Lego", "Binchiling");
        AquariumController aquariumController = new AquariumController("Lego",
                "Binchiling", (float) 7.16, fishfeeder, (float) 7.30);
        aquariumController.setCurrentTime(2);
        aquariumController.setFeedingTime(2);


        System.out.println(aquariumController.toString());
    }


}
