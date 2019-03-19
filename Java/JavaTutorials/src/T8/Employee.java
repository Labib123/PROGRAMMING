
package T8;

public class Employee {
    
    String name;
    int age;
    double salary;
   // No argument Constructor  
   Employee() {
        name = "not set";
        age = 1;
        salary = 100;
    }
   Employee ( String name , int age , double salary){
       this.name = name;
       this.age = age;
       this.salary = salary;
   }
   
   void setName ( String n){
       name = n;
   }
   
   String getName(){
       
       return name;
   }
   
   
    
    
}
