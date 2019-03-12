
package T6;

import java.util.Scanner;

public class ReverseString {
    
    public static void main( String[] args){
        
        Scanner input = new Scanner(System.in); 
        System.out.println(" enter String");
        String str = input.nextLine();
        System.out.println( " reversed "  +  reverseString(str));
    }
    
    public static String reverseString(String s){
        
        String result = "";
        
        for ( int i = s.length()-1 ; i >=0 ; i--) {
            
            result = result + s.charAt(i);
        }
        
        return result;
    }
    
}
