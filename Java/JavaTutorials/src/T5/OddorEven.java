
package T5;

import java.util.Scanner;

public class OddorEven {
    
    public static void main( String[] args) {        
        
        Scanner input = new Scanner(System.in);
        System.out.println( " Inout Number ");
        int num = input.nextInt();
        
        boolean res;
        res = isEven(num);
        if ( res == true) {
            System.out.println( " even Number");
        }
        else {
            System.out.println( " Odd Number");            
        }        
    }
    public static boolean isEven(int num) {
        
       if ((num % 2) == 0) {
           return true;            
       } 
       return false;
    }
    
  
    
}
