package shoppingcart;

import java.util.ArrayList;
import java.util.List;

public class Cart {

    private static List<Products> listofproducts = new ArrayList<>();

    public static void main(String[] args) {

        Products milk=new Products("Milk",70.00,2);
        Products apple=new Products("Apple", 110.00, 1);
        Products newspaper=new Products("NewsPaper",12.00,1);

        Cart cart = new Cart();
        cart.listofproducts.add(milk);
        cart.listofproducts.add(apple);
        cart.listofproducts.add(newspaper);

        Payment payment = new Payment();
        payment.generateBill(listofproducts);
    }
}
