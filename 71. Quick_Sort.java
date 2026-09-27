class Quick_Sort {
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
