
package T6;

public class StringsMethods {
    
    public static void main( String[] args) {
        
        String str1 , str2, str3 , str4;
        str1 = "A";
        str2 = "University";
        str3 = "a";
        str4 = "Faculty of Computer Science";
        
        // length of string
        System.out.println ( " length of str1 " + str1.length());
        // String Comparison
        if( str1.equals(str3)){
            System.out.println ( "  Strings Equal");
        }
        else {
             System.out.println ( "  Strings NOT Equal");            
        }
        
        System.out.println ( " compareTO" + str1.compareTo(str3) );
        
        // Substring
        System.out.println ( str4.substring(11));
        System.out.println ( str4.substring(11,20));
        
        
        
    }
    
}
