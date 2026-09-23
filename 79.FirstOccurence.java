class FirstOccurence {

    static int search(int[] arr, int num) {
        int n = arr.length;
        int st = 0, end = n - 1;
        int occ = -1;
        while (st <= end) {
            int mid = st + (end - st) / 2;
            if (arr[mid] == num) {
                occ = mid;
                end = mid - 1;
            }else if (arr[mid] > num) {
                end = mid - 1;
            } else {
                st = mid + 1;
            }

        }
        return occ;
}

        public static void main(String[] args) {
            int[] arr = {1,2,3,4,5,7,8};
           int fo = search(arr,8);
            System.out.println(fo);
    }
}
