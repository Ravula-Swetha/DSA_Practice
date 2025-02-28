/*
Magic Reflections: In a mystical world, a spell can concatenate the essence of two magical artifacts represented as sequences of integers. 
Once combined, the new sequence may reflect ancient symmetrical magic if it appears the same from both ends. 
As a novice wizard,your task is to determine if the resulting sequence from combining two artifacts holds this reflective, symmetrical property.


Test Case 1:
Input = 1 4 9
9 4 1
output true 

Test Case 2:
Input = 1 2 3
3 2 4 
output false
*/

import java.util.*;

class ReflectiveString{
    public static boolean check(ArrayList<String> s){
        int left = 0;
        int right = s.size() - 1;
        
        while(left < right){
            if(!s.get(left).equals(s.get(right))){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        String[] s1 = in.nextLine().split(" ");
        String[] s2 = in.nextLine().split(" ");
        ArrayList<String> l = new ArrayList<>();
        for(int i = 0; i < s1.length; i++){
            l.add(s1[i]);
        }
        for(int i = 0; i < s2.length; i++){
            l.add(s2[i]);
        }
        System.out.println(check(l));
        in.close();
    }
}
