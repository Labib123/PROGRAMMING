
package T4;

import java.util.Scanner;

public class RandomAddition {
    
    public static void main(String[] args){
        
        int num1, num2;
        
        Scanner kbd = new Scanner(System.in);
        
        num1 =(int) ( Math.random() * 10 );
        System.out.println(" Num1 : " + num1);
        num2 = (int) ( Math.random() * 10 );
        System.out.println(" Num1 : " + num2);
        
        System.out.print(" What is  " + num1 + "  + "
        + num2 + " ?  " );
        int userAnswer = kbd.nextInt();
        
        if ( userAnswer == ( num1 + num2))
            System.out.println(" Your answer is correct!");
        else
            System.out.println( " Oops The Answer is " + (num1 + num2));
       
        
        
        
        
        
    }
    
}
