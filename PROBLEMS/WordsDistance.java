/* 
 In the quiet town of Eldoria, a famous treasure was said to be hidden somewhere, waiting to be discovered. 
Many adventurers had tried to find it, but none had succeeded. 
One day, two explorers, Arin and Mira, discovered an ancient scroll in the town library.

The scroll contained a long passage filled with cryptic words. 
The legend said that the treasure's location could only be revealed if they correctly determined 
the shortest distance between two special words in the passage.

They read the passage carefully:
"The old castle stood on the highest hill, where knights once trained with their mighty swords. 
A golden key was hidden under the ancient oak tree, and the villagers often spoke of its mysterious glow. 
Legends told of a secret passage deep beneath the ground, leading to the lost chest that contained priceless jewels and forgotten artifacts."

Mira pointed at the scroll excitedly. "We need to find the word 'key' and the word 'chest' and count the words between them!"

Arin quickly scanned the passage. 
The word "key" appeared at position 19, and the word "chest" was at position 50.
"The shortest distance between them is 30 words!" he exclaimed.

The moment he spoke the answer, the scroll shimmered, and a hidden compartment in the library wall slid open. 
Inside, they found an old map leading them to the treasure buried deep within the Whispering Woods.

Their journey had just begun, but thanks to their keen observation and ability to measure the shortest path between two words, 
they were one step closer to uncovering Eldoria’s greatest mystery!

Example 1:
Input =apple banana cherry goa apple watermelon juice date
apple date
Output = 2
 */

 import java.util.*;

class WordsDistance{
    static int min = Integer.MAX_VALUE;
    public static int distance(String[] s, String w1, String w2){
        // int[] firstOccurance = new int[10];
        // int[] SecondOccurance = new int[10];
        // int k = 0, p = 0;
        int SecondOccurance = 100;
        int FirstOccurance = 100;
        for(int i = 0; i < s.length; i++){
            if(w1.equals(s[i])){
                // firstOccurance[k] = i;
                // k++;
                // System.out.println("Hi in w1");
                FirstOccurance = i;
            }
            if(w2.equals(s[i])){
                // SecondOccurance[p] = i;
                // p++;
                SecondOccurance = i;
            }
            min = Math.min(min, Math.abs(FirstOccurance-SecondOccurance));
        }
        // 
        // for()
        // firstOccurance
        return min-1;
    }
    
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        String[] s = str.split(" ");
        String s1 = in.next();
        String s2 = in.next();
        System.out.println(distance(s, s1, s2));
    }
}