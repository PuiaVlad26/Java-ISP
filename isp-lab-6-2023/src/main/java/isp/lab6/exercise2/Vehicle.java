package isp.lab6.exercise2;

public class Vehicle {
    private String vin;
    private String licensePlate;
    private String make;
    private String model;
    private int year;

    public Vehicle(String vin, String licensePlate, String make, String model, int year) {
        this.vin = vin;
        this.licensePlate = licensePlate;
        this.make = make;
        this.model = model;
        this.year = year;
    }

 Override
    public  toString() {
        return "Vehicle{" +
                "vin=" + vin +
                ", licensePlate=" + licensePlate +
                ", make=" + make +
                ", model=" + model +
                ", year=" + year +
                '}';
    }
@Override
    public String getVin() {
        return vin;
    }

    public void setVin(String vin) {
        this.vin = vin;
    }

    public String getLicensePlate() {
        return licensePlate;
    }

    public void setLicensePlate(String licensePlate) {
        this.licensePlate = licensePlate;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        if (!super.equals(object)) return false;
        Vehicle vehicle = (Vehicle) object;
        return year == vehicle.year && java.util.Objects.equals(vin, vehicle.vin) && java.util.Objects.equals(licensePlate, vehicle.licensePlate) && java.util.Objects.equals(make, vehicle.make) && java.util.Objects.equals(model, vehicle.model);
    }

    public int hashCode() {
        return java.util.Objects.hash(super.hashCode(), vin, licensePlate, make, model, year);
    }
}