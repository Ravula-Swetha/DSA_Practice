class InsertionSort{
    public static int[] sort(int[] arr){
        int n = arr.length;
        for(int i = 1; i < n; i++){
            int key = arr[i];
            int j = i-1;
            while( j >= 0 && arr[j] > key){
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = key;
        }
        return arr;
    }
    public static void printArr(int[] res){
        for(int i: res){
            System.out.print(i + " ");
        }
    }
    public static void main(String[] args) {
        int[] arr = {10, 5, 1, 7, 15};
        int[] res = sort(arr);
        printArr(res);
    }
}