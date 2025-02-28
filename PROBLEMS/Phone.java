/* Amazon fire tv stick keyboard wanted to be operated on number pad. 
You will be given the below pad. 
You are supposed to print all possible words in alphabetic order for a given number (0-9)

	1		2		3
		   abc	  def
		 
	4		5		6
   ghi     jkl    mno
  
	7		8		9
  pqrs     tuv   wxyz
	
	*		0		#


You will be given a string S which contains (2-9)  only  
For example: S = "3", then the possible words are "d", "e", "f".

Input Format:
-------------
String(2-9)

Output Format:
--------------
Print the list of words in alphabetical order


Sample Input-1:
---------------
2

Sample Output-1:
----------------
a b c


Sample Input-2:
---------------
24

Sample Output-2:
----------------
ag ah ai bg bh bi cg ch ci */

import java.util.ArrayList;

public class Phone {
    public static void sol(String input){
        ArrayList<String> l = new ArrayList<>();
        int n = 0;
        while(n < input.length()){
            String value = h.get(input.substring(n, n+1));
            for(int i = 0; i < l.size(); i++){
                for(int j = 0; j <value.length(); j++){
                    l.add(l.get(i) + value.substring(j, j+1));
                }
            }
            n++;
        }

    }
    public static void main(String[] args) {
        String s = "24";
        sol(s);
    }
}
