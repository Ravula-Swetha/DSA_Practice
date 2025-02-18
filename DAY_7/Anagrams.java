package DAY_7;

import java.util.HashMap;
import java.util.Scanner;

public class Anagrams {
    public static boolean isAnagram(String s1, String s2){
        if(s1.length() != s2.length()){
            return false;
        }
        HashMap<Character, Integer> h1 = new HashMap<>();
        HashMap<Character, Integer> h2 = new HashMap<>();
        
        for(int i = 0; i < s1.length(); i++){
            Character chr1 = s1.charAt(i);
            Character chr2 = s2.charAt(i);
            h1.put(chr1, h1.getOrDefault(chr1, 0)+1);
            h2.put(chr2, h2.getOrDefault(chr2, 0)+1);
        }
        return h1.equals(h2)? true : false;
    }
     public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter 2 Strings: ");
        String s1 = in.nextLine();
        String s2 = in.nextLine();
        System.out.println(isAnagram(s1, s2)? "Anagram" : "Not an Anagram");
        in.close();
    } 
}
