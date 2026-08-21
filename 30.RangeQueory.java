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
//    }
//}
