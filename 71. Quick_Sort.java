class Quick_Sort {
    static void displayarr(int[] arr) {
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }

    static void swap(int[] arr, int x, int y) {
        int temp = arr[x];
        arr[x] = arr[y];
        arr[y] = temp;
    }

    static int partition(int[] arr, int st, int end) {
        int pivot = arr[st];
        int c = 0;
        for (int i = st + 1; i <= end; i++) {
            if (arr[i] <= pivot) c++;
        }
        int pivotidx = st + c;
        swap(arr, st, pivotidx);
        int i = st, j = end;
        while (i < pivotidx && j > pivotidx) {
            while (arr[i] <= pivot) i++;
            while (arr[j] > pivot) j--;
            if(i < pivotidx && j > pivotidx) {
                swap(arr, i, j);
                i++;
                j--;
            }
        }
        return pivotidx;
    }
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
