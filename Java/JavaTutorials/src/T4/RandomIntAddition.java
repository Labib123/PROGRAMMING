
package T4;
import java.util.Random;
import java.util.Scanner;

public class RandomIntAddition {
    
    public static void main( String[] args){
        
        Random rand = new Random();
        
        Scanner input =  new Scanner( System.in);
        
        int num1 , num2;
        int userAsnwer;
        int correctAnswer;
        num1 = rand.nextInt(11);
        num2 = rand.nextInt(11);
        correctAnswer = num1 + num2;
        
        System.out.print( " What is " + num1 + " + "
        + num2 + " ?  ");
        userAsnwer = input.nextInt();
        
        
        if ( userAsnwer == correctAnswer)
            System.out.println( " Your answer is correct !");
        else
            System.out.println( " Oops! The correct answer is " + correctAnswer);
        
    }
    
}
