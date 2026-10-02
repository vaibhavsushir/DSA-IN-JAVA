class CountSort_Stable {

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
    static void countsort(int[] arr) {
        int n = arr.length;
        int[] output = new int[n];
        int max = max(arr);
        int[] count = new int[max + 1];
        for (int i = 0; i < arr.length; i++) {
            count[arr[i]]++;
        }
        for (int i = 1; i < count.length; i++) {
            count[i] += count[i - 1];
        }

        for (int i = n - 1; i >= 0; i--) {
            int idx = count[arr[i]] - 1;
            output[idx] = arr[i];
            count[arr[i]]--;
        }
        for (int i = 0; i < n; i++) {
            arr[i] = output[i];
        }
    }
    public static void main(String[] args) {
        int[] arr = {1,4,5,2,2,5,6};
        System.out.println("Original Array");
        displayarr(arr);
        countsort(arr);
        System.out.println();
        System.out.println("Aftr Sort");
        displayarr(arr);
    }
}
