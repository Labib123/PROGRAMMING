
import java.util.Scanner;

// Write a program that reads in a student’s name 
// and his/her grade (a single letter grade of either
// ‘A’, ‘B’, ‘C’, ‘D’, or ‘F’), and display the 
// name and grade in a single line. Save the program as
// StudentGrade.java.

public class StudentGrade {
    public static void main(String[] args){
        
        String name;
        char grade;
        
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter Name " );
        name = input.nextLine();
        
        System.out.print("Enter Grade " );
        grade = input.next().charAt(0);
        
        System.out.print("Student " + name + " has " + grade + " grade" );
        
    }
      
}
