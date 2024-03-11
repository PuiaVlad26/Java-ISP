package isp.lab3;

public class TreeTest {
    public static void main(String[] args) {

        TreeTest tree = new TreeTest();


        tree.grow(5);
        System.out.println("After growing 5 meters, " + tree.toString());


        System.out.println(tree.toString());


        tree.grow(0);
        System.out.println("After growing 0 meters, " + tree.toString());
    }

    private void grow(int i) {
    }
}
