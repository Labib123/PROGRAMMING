
package T4;

import java.util.Scanner;


public class RepetetiveAddition {
    
    public static void main( String[] args) {
        
        int num1 , num2;
        
        int count = 0;
        int  MAX = 10;
        int score =0;
        
        Scanner kbd = new Scanner(System.in);
        
        
        while (count < MAX) {
              num1 = (int) ( Math.random() * 10 );
              num2 = (int) ( Math.random() * 10 );
               System.out.print(" What is  " + num1 + "  + "
        + num2 + " ?  " );
               
        int userAnswer = kbd.nextInt();
        
        if ( userAnswer == ( num1 + num2)) {
            System.out.println(" Your answer is correct!");
            score++;
        }
        else
            System.out.println( " Oops The Answer is " + (num1 + num2));
        
        count++;             
              
        }
        // TODO : Give the appropriate instructions based on user score
        //if ( score )
        
        
      
        
        
        
    }
    
}
