import java.util.Scanner;
class Array_Recursion {

    static void arrprint(int[] arr,int idx) {
        if (idx == arr.length) {
            return ;
        }
        System.out.println(arr[idx]);
        arrprint(arr,idx+1);

    }
    static int max(int[] arr,int idx){
        if(idx == arr.length-1){
            return arr[idx];
        }
        int smallans = max(arr,idx+1);

        return Math.max(arr[idx],smallans);
    }
    public static void main(String[] args) {
        int[] arr = {5, 6, 7, 18, 9,4,3,2};
        Scanner input = new Scanner(System.in);
        System.out.print("Enter idx Number: ");
        int idx = input.nextInt();
        System.out.println("Array Is ");
        arrprint(arr, idx);
        int max = max(arr,idx);
        System.out.println("Maximum Is "+max);
    }
}
