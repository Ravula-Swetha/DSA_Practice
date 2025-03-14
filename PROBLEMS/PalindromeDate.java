/* 

Calendar Dates 

Ramu is playing with the dates of the calender, for his surprise he found few dates to be similar in both from left to right
and right to left.
He is now intrested to know all such dates in the calender. Help ramu in this.
IF NO PALINDROMIC DATES PRINT -1.


input = 2020
output = 02-02-2020


input = 2010
output = 01-02-2010


 */

 import java.util.*;
 import java.time.*;
 import java.time.format.*;
 
 class PalindromeDates{
     public static void main(String[] args){
         Scanner in = new Scanner(System.in);
         String year = in.next();
         String date = new StringBuilder(year.substring(2, 4)).reverse().toString();
         String month = new StringBuilder(year.substring(0,2)).reverse().toString();
         DateTimeFormatter fm = DateTimeFormatter.ofPattern("dd-MM-yyyy");
         String dateStr = date + "-" + month + "-" + year;
         try{
             LocalDate.of(Integer.parseInt(year), Integer.parseInt(month), Integer.parseInt(date));
             LocalDate.parse(dateStr, fm);
             System.out.println(dateStr);
         }
         catch(Exception e){
             System.out.println(-1);
         }
         in.close();
     }
 }

