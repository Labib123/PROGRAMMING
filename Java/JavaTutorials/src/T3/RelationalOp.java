
package T3;

import java.util.Scanner;

public class RelationalOp {
    
    public static void main(String[] args){
        
        int num1,num2;
        Scanner input = new Scanner(System.in);
        System.out.println(" Enter first number: ");
        num1 = input.nextInt();
        System.out.println(" Enter second number: ");
        num2 = input.nextInt();
        
        if ( num1 < num2 ) {
            System.out.println(" Second number is greater than first number ");
        }
        else if( num1 > num2){
            System.out.println(" First number is greater than second number ");
        } else {
            System.out.println(" First number is equal to  second number ");
       }
        
        
    }
}
