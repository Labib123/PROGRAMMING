// Write a program which assigns an integer value that 
// represents a time in second to a variable of 
// type ‘int’, calculates and prints out this time 
// in x hours, y minutes, and z seconds.
// The followings are some sample runs of this program:
// 600 seconds = 0 hours 10 minutes 0 seconds
// 3601 seconds = 1 hours 0 minutes 1 seconds
// 7200 seconds = 2 hours 0 minutes 0 seconds
// Hint: Use only operator such as % and /
package T2;
public class TimeConversion {
    
    public static void main(String[] args){
    
    int time = 7270;
    int res_hours, res_min, res_sec;
    res_hours = time / 3600;
    time = time % 3600;
    res_min = time / 60;
    time = time % 60;
    res_sec = time;
    
    System.out.print( time + " seconds = " + res_hours + " hours " 
    + res_min + " minutes " + res_sec + " seconds ");
       
    }
    
}
