class BubbleSort{
    public static int[] sort(int[] arr){
        int n = arr.length;
        int j = 1;
        int temp = 0;
        while(j != n){
            for(int i = 0; i < n-j; i++){
                if(arr[i] > arr[i+1]){
                    temp = arr[i];
                    arr[i] = arr[i+1];
                    arr[i+1] = temp;
                }
            } 
            j++;
        }
       return arr;
    }
    public static void printArr(int[] res){
        for(int i: res){
            System.out.print(i + " ");
        }
    }
    public static void main(String[] args) {
        int[] arr = {7, 16, 8, 5, 1};
        int[] res = sort(arr);
        printArr(res);
    }
}