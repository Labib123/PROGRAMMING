
import java.util.Scanner;

// Write a program that contains variables that hold 
// an hourly pay rate and number of hours worked. 
// Prompt user to enter values for both the variables, 
// compute and display the gross pay, the withholding tax,
// which is 15 percent of the gross pay, and the net pay
// (gross pay – withholding tax). 
// Save the program as Payroll.java.
public class Payroll {
    
    public static void main(String[] args){
        
        float payrate , hoursworked;
        float grosspay , tax , netpay;
        
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter hourly pay rate: " );
        payrate = input.nextFloat();
        
        System.out.print("Enter number of hours woked: " );
        hoursworked = input.nextFloat();
        
        grosspay = payrate * hoursworked;
        tax = .15f * grosspay ;
        
        netpay = grosspay - tax;
        
        
    }
    
}
