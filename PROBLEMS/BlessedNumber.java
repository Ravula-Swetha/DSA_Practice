/*Mystic Energy Number

In an ancient civilization, numbers were believed to carry mystical energy. 
A number is considered blessed if repeatedly replacing it with the sum of the squares of its digits eventually results in 1. 
However, if it falls into a never-ending cycle that does not include 1, it is considered cursed.

Input
An integer num (1 ≤ num ≤ 10⁶).
Output
Print "Blessed Number" if the number eventually reaches 1.
Otherwise, print "Cursed Number".


Example
Input = 23  
Output = Blessed Number

(Explanation: 23 → 2² + 3² = 13 → 1² + 3² = 10 → 1² + 0² = 1, so it is a Blessed Number.)

Input = 25  
Output = Cursed Number
(Explanation: 25 falls into a cycle and does not reach 1.)
*/



import java.util.*;

class BlessedNumber{
    public static boolean isBlessed(int num){
        if(num == 1){
            return true;
        }
        if(num  == 4){
            return false;
        }
        
        return isBlessed(sumSquare(num));
    }
    
    public static int sumSquare(int num){
        int sum = 0;
        while(num > 0){
            sum += Math.pow(num%10, 2);
            num = num/10;
        }
        return sum;
    }
    
    public static void main(String[] arg){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        if(isBlessed(n)){
            System.out.println("Blessed Number");
        }
        else{
            System.out.println("Cursed Number");
        }
        in.close();
    }
}

















