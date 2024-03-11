package isp.lab3.exercise2;

public class exercise2 {
    private int length = 2;
    private int width = 1;
    private String color = "red";

    public exercise2() {
    }

    public exercise2(int length, int width) {
        this.length = length;
        this.width = width;
    }

    public exercise2(int length, int width, String color) {
        this.length = length;
        this.width = width;
        this.color = color;
    }

    public int getLength() {
        return length;
    }

    public int getWidth() {
        return width;
    }

    public String getColor() {
        return color;
    }

    public int getPerimeter() {
        return 2 * (length + width);
    }

    public int getArea() {
        return length * width;
    }

    public static void main(String[] args) {
        exercise2 rectangle1 = new exercise2();
        exercise2 rectangle2 = new exercise2(4, 3);
        exercise2 rectangle3 = new exercise2(5, 2, "blue");


        System.out.println("Rectangle 1: length=" + rectangle1.getLength() + ", width=" + rectangle1.getWidth() + ", color=" + rectangle1.getColor() + ", perimeter=" + rectangle1.getPerimeter() + ", area=" + rectangle1.getArea());
        System.out.println("Rectangle 2: length=" + rectangle2.getLength() + ", width=" + rectangle2.getWidth() + ", color=" + rectangle2.getColor() + ", perimeter=" + rectangle2.getPerimeter() + ", area=" + rectangle2.getArea());
        System.out.println("Rectangle 3: length=" + rectangle3.getLength() + ", width=" + rectangle3.getWidth() + ", color=" + rectangle3.getColor() + ", perimeter=" + rectangle3.getPerimeter() + ", area=" + rectangle3.getArea());
    }
}