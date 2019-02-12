
package T3;

import java.util.Scanner;

public class ArithOperations {
    
    public static void main( String[] args){
        
        int num1,num2;
        
        char choice;
        
        Scanner input = new Scanner( System.in);
        
        System.out.print(" Enter integer 1: ");
        num1 = input.nextInt();
        System.out.print(" Enter integer 2: ");
        num2 = input.nextInt();
        float result;
        
        
        System.out.println(" What would you like to do? \n Press "
                + "\n + for total \n - for difference \n * for product");
        choice = input.next().charAt(0);
        
        switch (choice){
            case '+' :
                result = num1+ num2;
                System.out.println(" Total = " + result);
                break;
                
           case '-' :
                result = num1 - num2;
                 System.out.println(" Difference = " + result);
                break; 
                
           default:
               System.out.println( " Invalid choice");
               
        }
        
        
        
        
        
        
        
    }
    
}
