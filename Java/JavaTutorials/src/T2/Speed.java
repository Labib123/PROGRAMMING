

//Write a program that will compute and display the 
// average speed of a vehicle. 
// Declares two floating-point variables named distance 
// travelled (in km) and time taken (in hour) respectively.
//Both variables’ values are to be entered through 
// keyboard. Save the program as Speed.java.
package T2;
import java.util.Scanner;

public class Speed {
    
    public static void main(String[] args){    
        float distance;
        float time;
        float speed;
        
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter distance: " );
        distance = input.nextFloat();
        
        System.out.print("Enter time: " );
        time = input.nextFloat();
        
        speed = distance / time;
        System.out.print("Average speed is : " + speed + " KM/Hour");
        
                
                
    }
}
