package isp.lab6.exercise2;

import java.util.HashSet;
import java.util.Set;

public class Exercise2 {
    public static void main(String[] args) {
        Set<Vehicle> vehicleSet = new HashSet<>();

        Vehicle vehicle1 = new Vehicle("1234", "AB-51-LIZ", "Dacia", "Logan", 2006);
        Vehicle vehicle2 = new Vehicle("56780", "AB-26-VLD", "Dacia", "Duster", 2019);
        vehicleSet.add(vehicle1);
        vehicleSet.add(vehicle2);
        System.out.println("Inainte de stergere");
        for (Vehicle v : vehicleSet) {
            System.out.println(v);
        }
        vehicleRemove(vehicleSet, vehicle1);
        System.out.println("Dupa stergere");
        for(Vehicle v : vehicleSet){
            System.out.println(v);
        }

    }
    public static  void vehicleAdd(Set<Vehicle> vehicleSet, Vehicle vehicle){
        vehicleSet.add(vehicle);
    }
    public static void vehicleRemove(Set<Vehicle> vehicleSet, Vehicle vehicle){
        vehicleSet.remove(vehicle);
    }
    public static  boolean vehicleExists(Set<Vehicle> vehicleSet, String vin){
        for(Vehicle v : vehicleSet){
            if(v.getVin().equals(vin)){
                return true;
            }
        }
        return false;
    }
    public  static  void displayVehicleSet(Set<Vehicle> vehicleSet){
        for( Vehicle v : vehicleSet){
            System.out.println(v);
        }
    }
}
