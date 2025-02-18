// 1.	Create an ArrayList of integers, add five numbers, and print them. 
package DAY_12;

import java.util.*;
public class CreateArrayList {
  public static void main(String[] args) {
    List<Integer> l = new ArrayList<>();
    for(int i = 1; i <= 5; i++){
        l.add(i*5);
    }
    System.out.println("Elements of ArrayList: ");
    for(int i : l){
        System.out.print(i + " ");
    }
  }  
}
