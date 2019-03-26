
package T8;

public class Library {
    
    public static void main( String[] args){
        
        Book b1 = new Book("Java Fundamentals" , " herbert" , 60);
        Book b2 = new Book("C++ Fundamentals" , " herbert" , 60);
        
        b1.borrowBook();
        b1.toString();
        b2.toString();
        b2.borrowBook();
        b2.toString();
        b1.returnBook();
        b1.toString();
        b2.returnBook();
        b2.toString();
               
        
 
        
        
        
    }
    
}
