package isp.lab6.exercise3;

public class OnlineStore {
    private double Product;

    public OnlineStore(double product) {
        Product = product;

    }

    Override
    public String toString() {
        return "OnlineStore{" +
                "Product=" + Product +
                '}';
    }

    public double getProduct() {
        return Product;
    }

    public void setProduct(double product) {
        Product = product;
    }
}
