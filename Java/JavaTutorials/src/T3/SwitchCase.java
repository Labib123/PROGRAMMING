
package T3;

import java.util.Scanner;

public class SwitchCase {
    
    public static void main( String[] args){
        
        int num1,num2;
        char choice;
        int result = 0;
        
        Scanner input = new Scanner(System.in);
        
        System.out.println( " Enter integer 1: ");
        num1 = input.nextInt();
        System.out.println( " Enter integer 2: ");
        num2 = input.nextInt();
        
        System.out.println( " + for Addition /n - for Subtraction /n / for division");
        System.out.print(" Enter choice: ");
        choice = input.next().charAt(0);
        
        switch(choice){
            
            case '+':
                result = num1+num2;
                System.out.println(" Total : " + result);
                break;
            case '-' :
                result = num1 - num2;
                System.out.println(" Difference : " + result);
                break;  
                
             case '/' :
                result = num1 / num2;
                System.out.println(" Division : " + result);
                break; 
                
            default :
               System.out.println(" Invalid choice " );
                
        }
        
    }
}
