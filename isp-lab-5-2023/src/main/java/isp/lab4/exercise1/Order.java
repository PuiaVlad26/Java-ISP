package isp.lab4.exercise1;

import java.time.LocalDateTime;

public class Order {
   private String oderld;
   private LocalDateTime date;
   private Double totalprice;
private Product product;
   public Order(String oderld, LocalDateTime date, Double totalprice, Product product){
      this.oderld = oderld;
      this.date = date;
      this.totalprice = totalprice;
      this.product = product;
   }

   @Override
   public String toString() {
      return "Order{" +
              "oderld='" + oderld + '\'' +
              ", date=" + date +
              ", totalprice=" + totalprice +
              ", product=" + product +
              '}';
   }
}
