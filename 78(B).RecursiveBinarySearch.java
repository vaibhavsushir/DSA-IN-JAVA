class RecursiveBinarySearch {

    static boolean BinarySearch(int[] arr, int target, int st, int end) {
        if (st > end) return false;
            int mid = st + (end-st) / 2;
            if (arr[mid] == target) {
                return true;
            } else if (target < arr[mid]) {
                return BinarySearch(arr, target, st, mid - 1);
            } else {
                return BinarySearch(arr, target, mid + 1, end);
            }
        }
        public static void main(String[] args) {
            int[] arr ={1,3,6,7,8,9,12,25,37,64,82,91,94};
            int target = 37;
            boolean BinarySearch =BinarySearch(arr,target,0, arr.length-1);
            System.out.println("Target Is Ans "+BinarySearch);
        }
    }
