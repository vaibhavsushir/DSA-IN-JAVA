import java.util.Scanner;
 class TargetSearchArray {
//    static boolean search(int[] arr, int target, int idx) {
//        int n = arr.length;
//        if (idx >= n) {
//            return false;
//        }
//        if (arr[idx] == target) {
//            return true;
//        }
//        if (search(arr, target, idx + 1)) {
//            return true;
//        } else {
//            return false;
//        }
//    }
// return index
//    static int findidx(int[] arr, int target, int idx) {
//        int n = arr.length;
//        if (idx >= n) {
//            return -1;
//        }
//        if (arr[idx] == target) {
//            return idx;
//        }
//        return findidx(arr,target,idx+1);
//    }

    static void findidx(int[] arr, int target, int idx) {
        int n = arr.length;
        if (idx >= n) {
            return ;
        }
        if (arr[idx] == target) {
            System.out.println(idx);
        }
        findidx(arr,target,idx+1);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] arr = {1, 2, 3, 4, 5,4};
        System.out.print("Enter Target: ");
        int target = input.nextInt();
        System.out.print("Enter idx: ");
        int idx = input.nextInt();
        findidx(arr, target, idx);
    }
}
