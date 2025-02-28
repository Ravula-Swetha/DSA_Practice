
/*
Cob is working an Group of numbers.
His teacher gave him to print the Maximum product of the 'k' conseckutive numbers. 

The first line of input contains the group size followed by group numbers followed by k


sample input 1 :
----------------
5
1 5 3 2 10
3
sample output 1 :
-----------------
60

sample input 2 :
----------------
7
8 7 1 8 2 9 1
2
sample output 2:
----------------
56
*/


import java.util.*;

class MaxProduct{
    public static int maxProduct(int max,int product){
        return (product > max)? product: max;
    }
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = in.nextInt();
        }
        int k = in.nextInt();
        in.close();
        
        int product = 1;
        ArrayList<Integer> l = new ArrayList<>();
        
        if(n < k){
            System.out.println("-1");
            return;
        }

        for(int i = 0; i < k; i++){
            l.add(arr[i]);
            product *= arr[i];
        }

        int max = product;
        for(int i = k; i < n; i++){
            product = (product/l.remove(0)) * arr[i];
            max = maxProduct(max, product);
            l.add(arr[i]);
        }
        System.out.println(max);   
        
    }
}

// 60