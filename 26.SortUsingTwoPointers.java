class SortUsingTwoPointers {
    public static void main(String[] args) {
        int[] arr = {1,0,0,1,1,1,0,0,0,0,1};
        ArrayUtility.printarray(arr);
        sorted(arr);
    ArrayUtility.printarray(arr);

    }
    static void sorted(int[] arr){
        int n = arr.length;
        int left = 0;
        int right = n -1;
        while(left < right){
            if(arr[left] == 1 && arr[right] == 0){
                swap(arr,left,right);
                left++;
                right--;
            }
            if(arr[left] == 0){
                left++;
            }
            if(arr[right] == 1){
                right--;
            }
        }
    }
    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}

