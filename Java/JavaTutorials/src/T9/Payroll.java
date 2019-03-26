
package T9;

import java.util.Scanner;
import jdk.management.resource.internal.TotalResourceContext;


public class Payroll {
    
    public static void main( String[] args) {
        
        int SIZE = 10;
        
        double[] salary;
        double totalSalary = 0;
        salary = new double[SIZE];
        Scanner input = new Scanner( System.in);
        
        for ( int i = 0 ; i < SIZE ; i++) {            
            System.out.println( " Enter salary of Emp-" + (i+1) );
            salary[i] = input.nextDouble();   
            totalSalary = totalSalary + salary[i];
            if(salary[i] > highestSalary){
                highestSalary = salary[i] ; 
            }
        }
        
        
        System.out.println( " Total Salary : " + totalSalary);
        System.out.println("Hightst salary: " + highestSalary );

        
        
        
        
    }
    
    
    
}
