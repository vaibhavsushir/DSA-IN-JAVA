import java.util.Scanner;
class ReverseArray {
    public static void main(String[] args){
        int[] arr = {1,2,3,4,5,6,7,8,9};
        System.out.println("Original Array Is : ");
        printarray(arr);
        System.out.println("Reverse Array Is : ");
        int[] rev = reverse(arr);
        printarray(rev);
    }
    public static int[] reverse(int[] arr){
        int n = arr.length;
        int[] ans = new int[n];
        int j = 0;
        for(int i= n - 1; i >= 0; i--){
                ans[j] = arr[i];
                j++;
            }
        return  ans;
    }

    public static void printarray(int[] arr){
        for(int i=0; i < arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
}
