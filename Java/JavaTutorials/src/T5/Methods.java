
package T5;

public class Methods {
    
    public static void main( String[] args) {
        animalSound("cat", "meoow");       
    }
    
    /**
* This method prints out the verse with appropriate animal name
* and sound, given the parameters.
*/
public static void animalSound(String animalName, String sound)
{
System.out.println("Old McDonald had a farm");
System.out.println(eieio());
System.out.println("and on his farm he had a " + animalName);
System.out.println(eieio());
System.out.println("with a " + sound + ", " + sound + " here ");
System.out.println("and a " + sound + ", " + sound + " there ");
System.out.println("here a " + sound + ", there a " + sound + ",");
System.out.println("Everywhere a " + sound + ", " + sound );
System.out.println("Old McDonald had a farm");
System.out.println(eieio());
}
/**
* This method returns the string 'e-i-e-i-o'
*/
public static String eieio()
{
return "E-I-E-I-O!!!";
}
    
    
    
}
