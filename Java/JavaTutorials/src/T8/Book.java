
package T8;

public class Book {
    
    // Atributes / Data Members
    private String title;
    private String author;
    private double price;
    private boolean onLoan; 
  
    Book( String title , String a , double price ){
        
        this.title = title;
        // this.author = author;
        author = a;
        this.price = price;
        
    }
    
    void setTitle( String title) {
        this.title = title;
    }
    
    String getTitle(){
        return title;
    }
}
