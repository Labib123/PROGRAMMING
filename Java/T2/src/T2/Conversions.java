// Write a program that will convert a measurement in cm 
// into m and cm, both measurements are integers.
// (Hint: 100 cm = 1 m, use % and /).
public class Conversions {
    public static void main(String[] args){
        int measurein_cm = 1050;
        int res_meters , res_cm;
        
        res_meters = measurein_cm/ 100;
        res_cm = measurein_cm % 100;
        
        System.out.print( measurein_cm + "cm = " + 
                res_meters + " m, " + res_cm + " cm" );
        
        
    }
    
}
