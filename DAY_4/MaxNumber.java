// 3.	Write a method to return the maximum of three numbers. 
import java.util.*;

public class MaxNumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        String[] str = s.split(" ");
        int[] arr = new int[3];
        for(int i = 0; i <3; i++){
            arr[i] = Integer.parseInt(str[i]);
        }
        int max = arr[0];
        if(arr[1] > max) max = arr[1];
        if (arr[2] > max) max = arr[2];

        System.out.println("Max Number: " + max);
        in.close();
    }
}
