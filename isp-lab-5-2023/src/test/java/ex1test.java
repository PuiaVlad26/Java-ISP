package isp.lab4.exercise1;

import org.junit.Test;

import static org.junit.Assert.*;

public class ex1test {
    @Test
    public void Testex1() {
        ProductCategory productCategory = ProductCategory.ELECTRONICS;
        Adress adress = new Adress("Observator", "Cluj");
        Customer customer = new Customer("Altey", "Altex", "07666", adress);
        Product product = new Product("Altey", "Acer", 4000, productCategory, customer);
        assertEquals("Product{productld='Altey', name='Acer', price=4000.0, productCategory=Electronics & Gadgets," +
                " customer=Customer{customrld='Altey', name='Altex', phone='07666'}}", product.toString());
    }

}
