package isp.lab3.example.exercise1;

public class exercise1 {
    public int height;

    public exercise1() {
        this.height = 15;
    }

    public void grow(int meters) {
        if (meters >= 1) {
            this.height += meters;
        }
    }

    public String toString() {
        return "Height of the tree is: " + height + " meters.";
    }
}




