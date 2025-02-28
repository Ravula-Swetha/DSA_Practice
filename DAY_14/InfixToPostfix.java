//  Infix to Postfix Conversion: 
// Convert the following infix expression to postfix and evaluate i 
// (A + B) * (C - D) 


import java.util.*;

public class InfixToPostfix {
    public static void helper(String exp) {
        Stack<Character> stack = new Stack<>();
        for(int i = 0; i < exp.length(); i++){
            char ch = exp.charAt(i);

            if(ch >= 'a' && ch <= 'z'){
                System.out.print(ch);
            }
            else{
                if(stack.isEmpty() || ch == '('){
                    stack.push(ch);
                }
                else if(ch == ')'){
                    while(!stack.isEmpty() && stack.peek() != '('){
                        System.out.print(stack.pop());
                    }    
                    System.out.println("Stack: " + stack);
                    stack.pop();
                }
                else{
                    char top = stack.peek();
                    if((ch == '*' || ch == '/') && (top == '+' || top == '-')){
                        stack.push(ch);
                    }
                    else{
                        while(!stack.isEmpty()){
                            // System.out.println("Stack: " + stack);
                            System.out.print(stack.pop());
                        }
                        stack.push(ch);
                    }
                }
            }
        }
        if(!stack.isEmpty()){
            while(!stack.isEmpty()){
                System.out.print(stack.pop());
            }
        }
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String exp = in.next();
        helper(exp);
        in.close();
    }    
}
