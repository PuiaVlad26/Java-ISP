package isp.lab3.exercise3;

public class VehicleTest {
    public static void main(String[] args) {
        Vehicle v1 = new Vehicle("Dacia", "Logan", 150, 'B');
        Vehicle v2 = new Vehicle("Ford", "Fiesta", 180, 'D');

        System.out.println("Model of v1 before: " + v1.getModel());
        v1.setModel("Sandero");
        System.out.println("Model of v1 after: " + v1.getModel());

        System.out.println("Speed of v2 before: " + v2.getSpeed());
        v2.setSpeed(200);
        System.out.println("Speed of v2 after: " + v2.getSpeed());

        System.out.println(v1.equals(v2));

        System.out.println(v1.toString());
        System.out.println(v2.toString());

        System.out.println("Number of Vehicle objects created: " + Vehicle.getNumVehicles());

        Vehicle.displayNumVehicles();
    }
}

