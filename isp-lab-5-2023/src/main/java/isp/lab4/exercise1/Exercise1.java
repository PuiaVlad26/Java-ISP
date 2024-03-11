package isp.lab4.exercise1;

public class Exercise1 {

    public static void main(String[] args) {
        ProductCategory productCategory = ProductCategory.ELECTRONICS;
            Adress  adress =  new Adress("Observator","Cluj" );
            Customer   customer = new Customer("Altey","Altex","07666",adress);
            Product product = new Product("Altey","Acer",4000, productCategory, customer);
        System.out.println(product.toString());
    }

}
