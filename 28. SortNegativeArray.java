class SortNegativeArray{
    public static void main(String[] args) {
        System.out.println("Welcome To Sorted Non Decreasing Array By There Square");
        int [] arr = {-10,-5,-2,1,4,9};
        System.out.println("Before Sorting");
        ArrayUtility.printarray(arr);
        System.out.println("After Sorting");
        sortsquare(arr);
        ArrayUtility.printarray(arr);
    }

static void sortsquare(int[] arr) {
    int n = arr.length;
    int left = 0;
    int right = n - 1;
    int[] ans = new int[n];
    int k = n - 1; // start filling from the end

    while (left <= right) {
        if (Math.abs(arr[left]) > Math.abs(arr[right])) {
            ans[k--] = arr[left] * arr[left];
            left++;
        } else {
            ans[k--] = arr[right] * arr[right];
            right--;
        }
    }

    // Copy back to original array
    for (int i = 0; i < n; i++) {
        arr[i] = ans[i];
    }
}
}

