class Quick_Sort {
            static void quicksort ( int[] arr, int st, int end){
                if (st >= end) return;
                int pi = partition(arr, st, end);
                quicksort(arr, st, pi - 1);
                quicksort(arr, pi + 1, end);
            }
    public static void main(String[] args) {
        int[] arr = {6,3,1,5,4};
        System.out.println("Original Array");
        displayarr(arr);
        quicksort(arr,0, arr.length-1);
        System.out.println();
        System.out.println("Aftr Sort");
        displayarr(arr);
    }
}
