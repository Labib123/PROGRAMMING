
package T8;

public class EmployeeTest {
    
    public static void main( String[] args) {
        
        Employee e1 = new Employee();
        System.out.println( e1.toString());
        
        // TODO prompt user for the values
        String name = " Alice";
        int age = 22;
        float salary = 5000;
        
        Employee e2 = new Employee ( name , age, salary);
         System.out.println( e2.toString());
         
         e1.setName("Ali ");
         System.out.println( e1.toString());
    
        
    }
    
}
