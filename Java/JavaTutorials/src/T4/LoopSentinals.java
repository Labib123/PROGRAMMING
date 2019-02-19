
package T4;

import java.util.Scanner;

// Here we assume user input the Id as 4 digit number
// except when user quit ( value 0)
public class LoopSentinals {
    public static void main( String[] args){
        
        int id ;
        int count = 0;
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter student ID ( 0 t0 stop) ");
        id = input.nextInt();
        while ( id!=0 ) {
            System.out.println("Enter student ID ( 0 t0 stop) ");
            id = input.nextInt();
            count++;
        }
        
        System.out.println( " Number of students " + count);
        
    }
    
}
