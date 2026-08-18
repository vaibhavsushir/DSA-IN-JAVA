 class SortEvenOddUseTwoPointers {
    public static void main(String[] args) {
    int[] arr = {3,6,7,8,12,51,22,84,19};
        System.out.println("Unsorted Array");
        ArrayUtility.printarray(arr);
        sort(arr);
        System.out.println("Sorted Array");
        ArrayUtility.printarray(arr);
    }
    static void sort(int[] arr){
        int n = arr.length;
        int left = 0;
        int right = n - 1;
        while(left < right){
            if(arr[left] % 2 != 0 && arr[right] % 2 == 0){
                swap(arr,left,right);
            }
            if(arr[left] % 2 == 0){
                left++;
            }
            if(arr[right] % 2 != 0){
                right--;
            }
        }

    }
    static void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
