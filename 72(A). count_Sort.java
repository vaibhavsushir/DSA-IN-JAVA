class count_Sort {
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
    static void countsort(int[] arr){
        int max = max(arr);
        int[] count = new int[max+1];
        for(int i=0; i<arr.length;i++){
            count[arr[i]]++;
        }
        int k=0;
        for(int i=0;i< count.length;i++) {
            for (int j = 0; j < arr[i]; j++) {
                arr[k++] = i;
            }
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
