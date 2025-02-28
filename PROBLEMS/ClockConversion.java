/* Tubby a Third Class Student has given a Assignment on Time Chapter by his class teacher.
Tubby is supposed to change the time given in AM/PM Format to 24 Hours Format. 
Help Tubby Solve the Problem 
  
The Maths teacher gave him the time in the following Format - HH:MM:SS:AM/PM
   
Assume all HH,MM,SS are in the valid range only 
  
Note: Midnight is 12:00:00AM on a 12-hour clock,  and 00:00:00 on a 24-hour clock. 
Noon is 12:00:00PM on a 12-hour clock,  and 12:00:00 on a 24-hour clock. 
       
Assume all input times are valid
    

Example:
input = 06:10:20PM
output = 18:10:20
      
 */
import java.util.*;
public class ClockConversion {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        String str = in.next();
        String[] s = str.split(":");
        if(s[2].charAt(2) == 'A'){
            String x = s[0];
            if(s[0].equals("12")){
                x = "00";
            }
            System.out.println(x + ":" + s[1] + ":" + s[2].substring(0, 2));
        }
        else{
            int x = Integer.valueOf(s[0]) + 12;
            if(s[0].equals("12")){
                x = 12;
            }
            System.out.println(x + ":" + s[1] + ":" + s[2].substring(0, 2));
        }
        in.close();
    }
}

