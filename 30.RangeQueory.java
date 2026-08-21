import java.util.Scanner;
class RangeQueory{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcom To Print Sum Form 1 To Range\n");
        System.out.print("Enter How Many Queory: ");
        int q = input.nextInt();
        int[] arr = ArrayUtility.takingarray();
        int[] pref = prefixsum(arr);
        while(q-- > 0){
            System.out.println("Enter Range: ");
            int l = input.nextInt();
            int r = input.nextInt();

            int ans  = pref[r] - pref[l-1];
            System.out.println("Sum Is "+ans);
        }
    }
    static int[] prefixsum(int[] arr){
        int n = arr.length;
        for(int i = 1; i < n; i++){
            arr[i] = arr[i] + arr[i-1];
        }
        return arr;
    }
}
//import java.util.Scanner;
//
//class RangeQuery {
//    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//        System.out.println("Welcome To Print Sum From 1 To Range\n");
//
//        System.out.print("Enter Array Size: ");
//        int n = input.nextInt();
//        int[] arr = new int[n];
//        System.out.println("Enter " + n + " elements:");
//        for (int i = 0; i < n; i++) {
//            arr[i] = input.nextInt();
//        }
//
//        int[] pref = prefixsum(arr);
//
//        System.out.print("Enter How Many Queries: ");
//        int q = input.nextInt();
//
//        while (q-- > 0) {
//            System.out.println("Enter Range (l r): ");
//            int l = input.nextInt(); // left index
//            int r = input.nextInt(); // right index
//
//            int ans;
//            if (l == 0) {
//                ans = pref[r];
//            } else {
//                ans = pref[r] - pref[l - 1];
//            }
//            System.out.println("Sum Is " + ans);
//        }
//    }
//
//    static int[] prefixsum(int[] arr) {
//        int n = arr.length;
//        for (int i = 1; i < n; i++) {
//            arr[i] = arr[i] + arr[i - 1];
//        }
//        return arr;
//    }
//}
