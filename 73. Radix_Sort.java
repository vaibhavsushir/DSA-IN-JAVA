
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
