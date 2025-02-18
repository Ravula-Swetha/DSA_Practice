// 2.	Implement a method to remove even numbers from an ArrayList. 
package DAY_12;

import java.util.ArrayList;
import java.util.List;

public class RemoveEven {
    public static void main(String[] args) {
        List<Integer> l = new ArrayList<>();
        for(int i = 1; i <= 10; i++){
            l.add(i);
        }

        for(int i = 0; i < l.size(); i++){
            if(l.get(i) % 2 == 0) l.remove(i);
        }

        System.out.println("Elements of ArrayList: ");
        for(int i : l){
            System.out.print(i + " ");
        }
    }
}
