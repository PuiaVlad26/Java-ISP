package isp.lab6.exercise3;

public class Product {
    public double name;
    public int price;

    public Product(double name, int price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name=" + name +
                ", price=" + price +
                '}';
    }

    public double getName() {
        return name;
    }

    public void setName(double name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        if (!super.equals(object)) return false;
        Product product = (Product) object;
        return java.lang.Double.compare(product.name, name) == 0 && price == product.price;
    }

    public int hashCode() {
        return java.util.Objects.hash(super.hashCode(), name, price);
    }
}
