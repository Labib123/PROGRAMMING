
package T3;

import java.util.Scanner;

public class CDPurchase1 {
    
    public static void main( String[] args){
        
        float sellingPrice = 5.8F;
        int quantity;
        float discount = 0;        
        float amountPaid = 0;
        float totalPrice =0;
        
        Scanner input = new Scanner(System.in);
        
        System.out.print( " Quantity of CD-R disks? ");
        quantity = input.nextInt();
        
        if ( quantity <= 5) {
            totalPrice = sellingPrice * quantity;            
        }
        if ( quantity >=6 && quantity <=20) {
             totalPrice = sellingPrice * quantity;
             discount = 0.1f * totalPrice ;           
        }
        if ( quantity > 20) {
              totalPrice = sellingPrice * quantity;
             discount = 0.15f * totalPrice ;
                              
        }
        amountPaid = totalPrice - discount;  
        
        System.out.println("Quanity of CD-R disks? " + quantity);
        System.out.println("Unit price " + sellingPrice);
        System.out.println("Quanity obought " + quantity);
        System.out.println("Discount  " + discount);
        System.out.println(" Amount Paid: " + amountPaid);    
        
    }
    
}
