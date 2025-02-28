import java.util.*;

class NextGreatestNum{
    public static void helper(int[] arr, int n) {
        for(int i = 0; i < n; i++){
            int j = i+1;
            boolean flag = false;
            while(j < n){
                if(arr[i] < arr[j]){
                    System.out.println(arr[i] + " -> " + arr[j]);
                    flag = true;
                    break;
                }
                j++;
            }
            if(!flag){
                System.out.println(arr[i] + " -> " + "-1");
            }
        }
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i <n; i++){
            arr[i] = in.nextInt();
        }

        helper(arr, n);
        in.close();
    }
}