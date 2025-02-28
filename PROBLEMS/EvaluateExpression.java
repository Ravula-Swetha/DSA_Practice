/*
Given an expression in string format print the value of the expression after evaluating 

Rules for Evaluation :
The expression is Evaluated from Left to Right and operators allowed are only +,-,/,*
Ignore Operator Precedence and evaluate the expression from left to right
Assume the expression only consists of numbers(0-9)(both postive and negative) and 
operators(+,-,*,/)

Test Case-1
input = 2+3*6
output = 30

Explanation :- The sum of 2+3 is 5 and 5*6 = 30 


Test Case-2
input = 5+7-9+0*0+1
output = 1

Explanation - The sum of 5+7 is 12 
12-9 is 3 and 3+0 is 3, 3*0 is 0 and 0+1 is 1 


Test Case-3
input = -1+-1*2
output = -4

Explanation -
-1 + -1 is -2 
and -2 * 2 is -4


*/

import java.util.*;

class EvaluateExpression{
    static String digits = "0123456789";
    static Queue<Integer> num =  new LinkedList<>();
    static Queue<String> op =  new LinkedList<>();

    public static void solve(String s){
        // '5' - '0' = 5
        for(int i = 0; i < s.length(); i++){
            String val = s.substring(i, i+1);
            if(digits.contains(val)){
                num.add(Integer.parseInt(val));
                // if(num.size() > 1 && op.size() > 0){
                //     System.out.println("num: " + num + " op: " + op);
                //     operation(num, op);
                // }
            }
            else{
                if((s.charAt(0) == '-' && i == 0) || (s.charAt(i) =='-' && !digits.contains(s.substring(i-1, i)))){
                    // System.out.println("s.charAt(i): "+ s.charAt(i) +"inside: " + ((s.charAt(0) == '-')));
                    int x = -1*Integer.parseInt(s.substring(i+1, i+2));
                    num.add(x);
                    i++;
                }
                else{
                    op.add(val);
                }
            }
        }
        // System.out.println(num.remove());
        System.out.println(operation(num, op));
    }
    public static int operation(Queue<Integer> num, Queue<String> op){
            int ans = num.remove();
            while(!op.isEmpty() && !num.isEmpty()){
                // if(op.peek().equals("-")){
                //     op.poll();
                //     ans = -1 * ans;
                // }
                switch(op.remove()){
                    case "+":
                       ans += num.remove();
                       break;
                    case "-":
                       ans -= num.remove();
                       break;
                    case "*":
                       ans *= num.remove();
                       break;
                    case "/":
                       ans /= num.remove();
                       break;
                }
            }
            // if(!op.isEmpty() && op.poll().equals("-")) ans = ans * -1;
            // num.add(ans);
            return ans;
            // System.out.println("Inside operation::: num: " + num + " op: " + op + " checking op : " + op.isEmpty());
    }
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        String s = in.next();
        solve(s);
        in.close();
    }
}