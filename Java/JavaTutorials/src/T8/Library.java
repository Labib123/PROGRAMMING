
package T8;

public class Library {
    
    public static void main( String[] args){
        
        Book b1 = new Book("Java Fundamentals" , " herbert" , 60);
        Book b2 = new Book("C++ Fundamentals" , " herbert" , 60);
        
        b1.borrowBook();
        System.out.println(b1.toString());
        System.out.println(b2.toString());
        b2.borrowBook();
        System.out.println(b2.toString());
        b1.returnBook();
        System.out.println(b1.toString());
        b2.returnBook();
        System.out.println(b2.toString());
               
        
 
        
        
        
    }
    
}
