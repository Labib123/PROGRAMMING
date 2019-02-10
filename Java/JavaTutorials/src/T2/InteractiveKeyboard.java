// 
import java.util.Scanner;

public class InteractiveKeyboard {
    
    public static void main(String[] args){        
        String name ;
        String add;
        int age;        
        Scanner input = new Scanner (System.in);
        System.out.println( " Enter name: ");
        // https://stackoverflow.com/questions/13102045/scanner-is-skipping-nextline-after-using-next-or-nextfoo
        // https://stackoverflow.com/questions/5073898/why-is-my-program-skipping-a-prompt-in-a-loop
        name = input.nextLine();
        System.out.println( " Enter age: ");
        age = input.nextInt();
        // Consume newline left-over
        input.nextLine();
        System.out.println( " Enter Address: ");
        add = input.nextLine();
        
        System.out.println( " Hello " + name + " !,  you are in " + age/10 + "0's" + ", from " + add);
        
        
    }
    
}
