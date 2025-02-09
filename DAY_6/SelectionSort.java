public class SelectionSort {
    public static int[] sort(int[] arr){
        int n = arr.length;
        int temp = 0;
        for(int i = 0; i < n-1; i++){
            int min_idx = i;
            for(int j = i+1; j <n; j++){
                if(arr[min_idx] > arr[j]){
                    min_idx = j;
                }
            }
            temp = arr[i];
            arr[i] = arr[min_idx];
            arr[min_idx] = temp;
        }
        return arr;
    }
    public static void printArr(int[] res){
        for(int i: res){
            System.out.print(i + " ");
        }
    }
    public static void main(String[] args) {
        int[] arr = {2, 4, 8, 15, 1};
        int[] res = sort(arr);
        printArr(res);
    }
}
