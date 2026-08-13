import java.util.Scanner;
// Reverse Array Without Creating New Array Reverse Changing Same Array InPlace
class ReverseArrayInPlace {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8};
        reverse(arr);
        printarray(arr);

    }
    public static void printarray ( int[] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    static void reverse(int[] arr) {
        int i = 0, j = arr.length - 1;
        while (i < j) {
            swap(arr, i, j);
            i++;
            j--;
        }


//    static int[] reverse(int[] arr){
//        int n = arr.length;
//        int i = 0,j=n-1;
//        while(i <= j)
//        for(i = 0; i < n; i++){
//        arr[i++] = arr[j--];
//            }
//        return arr;
//        }
    }
}
