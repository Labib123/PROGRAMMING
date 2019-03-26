
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
        onLoan = false;
        
    }
    
    void setTitle( String title) {
        this.title = title;
    }
    
    String getTitle(){
        return title;
    }
    
    void borrowBook() {
        onLoan = true;        
    }
    void returnBook() {
        onLoan = false;        
    }
    
    private boolean isAvailable(){
        return !onLoan;
    }
    
    public String toString(){

        if ( isAvailable())
            return (title + " by " + author + " cost: " + price 
                + " is currently available for loan");
        else
            return (title + " by " + author + " cost: " + price 
                + " is already borrowed");
            
    
    }
}