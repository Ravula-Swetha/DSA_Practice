// Solve the Subset Sum problem, where given an array and a sum, find all subsets that sum to the target. 

import java.util.ArrayList;

public class SubsetSum {
    public static void subset(int[] arr, int target, int index, ArrayList<Integer> l) {
        if(target == 0){
            System.out.println(l);
            return;
        }
        if(index >= arr.length || target < 0){
            return;
        }

        //include
        l.add(arr[index]);
        subset(arr, target-arr[index], index + 1, l);

        //exclude
        l.remove(l.size() - 1);
        subset(arr, target, index + 1, l);
    }
    public static void main(String[] args) {
        int[] arr = {2, 4, 1, 6, 3, 8, 7};
        int target = 9;
        ArrayList<Integer> l = new ArrayList<>();
        subset(arr, target, 0, l);
    }
}
