
package isp.lab3.exercise4;

public class Testex4 {
    public static void main(String[] args) {
        MyPoint p1 = new MyPoint(1, 2, 3);
        MyPoint p2 = new MyPoint(4, 5, 6);
        System.out.println("Distance between " + p1.toString() + " and " + p2.toString() + ": " + p1.distance(p2));
    }
}
