
package T3;

import java.util.Scanner;

public class Purchase {
    
    public static void main( String[] args){
        
        float unitprice = 5.8F;
        int quantity = 0;
        float amountPaid = 0;
        float totalAmount;
        float discount = 0;
        
        Scanner input = new Scanner( System.in);
        
        System.out.print(" Quantity of CD-R disks? ");
        quantity = input.nextInt();
        
        totalAmount = unitprice * quantity;
        
        if(quantity <=5){
            discount = 0;
        } else if ( quantity <=20){
            discount = 0.1f * totalAmount;
        }
        else {
            discount = 0.15f * totalAmount;
        }
        
        amountPaid = totalAmount - discount;
        System.out.println("Unit price " + unitprice);
        System.out.println("Quantity " +  quantity);
        System.out.println("Discount " +  discount);        
        System.out.println(" Amount  paid " + amountPaid );
        
        
        
        
        
        
        
        
    }
    
}
