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
