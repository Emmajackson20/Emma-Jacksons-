import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

class User {
    private String name;
    private String email;

    public User(String name, String email) {
        this.name = name;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}

class Product {
    private String name;
    private double price;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}

class Order {
    private User user;
    private Product product;
    private int quantity;
    private double totalAmount;

    public Order(User user, Product product, int quantity) {
        this.user = user;
        this.product = product;
        this.quantity = quantity;
        this.totalAmount = product.getPrice() * quantity;
    }

    public User getUser(){
        return user;
	
}
public Product getProduct(){
    return product;
}
public int getQuantity(){
    return quantity;
}
public double
getTotalAmount(){
    return totalAmount;
}
@Override
public String toString(){
    return "order{" + 
    "user=" + user +
    ", product=" +
    product +
    ",quantity=" +
    quantity+
    ", totalAmount="
    +totalAmount+
'}';
}
}
public class agricEnterpriseApp {

    public static void main(String[] args) {
        //CREATE SOME USERZ
        User user1 = new User("JOHNSON","johson42@gmail.com");
        User user2=new User("BOSCO","bosco11@gmail.com");
        User user3=new User("JOB","job99@gmail.com");
        // CREATE SOME PRODUCTS
        Product product1= new Product("Maize",1000);
        Product product2 = new Product("Beans",2000);
        Product product3 = new Product ("Millet",4000);
        //CREATE SOME ORDERS
        Order order1 = new Order(user1, product2,8);
        Order order2 = new Order(user2, product3, 10);
        Order order3 = new Order(user3, product1, 20);
        //OUTPUT ORDERS
        System.out.println(order1);
        System.out.println(order2);
        System.out.println(order3);


    }
}






    

