
package T5;

import java.util.Scanner;

public class OddEven1 {
    
    public static void main( String[] args) {        
        
        Scanner input = new Scanner(System.in);
        System.out.println( " Inout Number ");
        int num = input.nextInt();
        
        //String res;
        //res = isEven(num);   
        //System.out.println( res);
       System.out.println( isEven(num));
    }
    public static String isEven(int num) {
        
       if ((num % 2) == 0) {
           return "Even Number ";            
       } 
       return " Odd Number";
    }
    
  
    
}
