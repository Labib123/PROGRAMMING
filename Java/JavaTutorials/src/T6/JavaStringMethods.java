
package T6;

public class JavaStringMethods {
    
    public static void main( String[] args) {
        
        int num1 = 30;
        int num2 = 40;
        String str1 = new String("Java");
        String str2 = new String("Java");
     
    
        
        // Compare the address of the two string objects
        if ( str1 == str2 ) {
            System.out.println( " Strings are equal");
        } else {
            System.out.println( " Strings are NOT  equal");
        }
         
        // Compare the values of strings
        if ( str1.equals(str2)  ) {
            System.out.println( " Strings are equal");
        } else {
            System.out.println( " Strings are NOT  equal");
        }
    }
    
}
