package shoppingcart;

import java.util.List;
import java.util.Scanner;

public class Payment {
    private double total=0;
    private double discountTotal =0;

    public void generateBill(List<Products> listofproducts)
    {
        for (Products product:listofproducts) {
            total+= product.getPrice();
            checkMilkOffer(product);
        }
        finalPayment();
    }

    public void checkMilkOffer(Products product)
    {
        if(product.getName().equalsIgnoreCase("Milk"))
        {
            if(product.getQuantity()==2)
            {
                System.out.println("You will get 1 litre of milk free");
            }
        }
    }

    public void finalPayment(){
        System.out.println("Enter \"w\" for wallet and \"c\" for cash payment:");
        Scanner sc=new Scanner(System.in);
        String input=sc.nextLine();
        if(input.equalsIgnoreCase("w") && total>=100.00){
            discountTotal =total*.05;
            System.out.println("5 % discount on wallet payment Discounted Total: "+(total-discountTotal));
        }
        else if(input.equalsIgnoreCase("c")){
            System.out.println("Total Price: "+total);
        }
        else {
            System.out.println("Invalid Input");
        }
    }
}
