class Radix_Sort {
    static void displayarr(int[] arr) {
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
    static int max(int[] arr){
        int max = Integer.MIN_VALUE;
        for(int i=0;i< arr.length;i++){
            if(arr[i] > max){
                max = arr[i];
            }
        }
        return max;
    }
    static void countSort(int[] arr,int place) {
        int max = max(arr);           // Find maximum value
        int n= arr.length;
        int[] count = new int[10];// Count array
        int[] output = new int[n];
        // Count occurrences of each element
        for (int i = 0; i < n; i++) {
            int digit = (arr[i] / place) % 10;
            count[digit]++;
        }

        // Prefix sum (cumulative count)
        for (int i = 1; i < 10; i++) {
            count[i] += count[i - 1];
        }

        // Build output (stable sorting, go from right to left)
        for (int i = n - 1; i >= 0; i--) {
            int digit = (arr[i] / place) % 10;
            output[count[digit] - 1] = arr[i];
            count[digit]--;
        }

        // Copy output back to arr
        for (int i = 0; i < n; i++) {
            arr[i] = output[i];
        }
    }
    static void displayArr(int[] arr) {
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
static void radixsort(int[] arr) {
    int max = max(arr);
    for (int place = 1; max / place > 0; place *= 10) {
        countSort(arr, place);
    }
}
    public static void main(String[] args) {
        int[] arr = {1, 4, 5, 2, 2, 5, 6};
        System.out.println("Original Array:");
        displayArr(arr);
        radixsort(arr);
        System.out.println();
        System.out.println("After Count Sort:");
        displayArr(arr);
    }
}
