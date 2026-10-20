//public class count {
//    import java.util.Scanner;
//
//    class CountSort {
//
//        // Function to display array
//        static void displayArr(int[] arr) {
//            for (int i : arr) {
//                System.out.print(i + " ");
//            }
//            System.out.println();
//        }
//
//        // Function to find the maximum value in array
//        static int max(int[] arr) {
//            int max = Integer.MIN_VALUE;
//            for (int i = 0; i < arr.length; i++) {
//                if (arr[i] > max) {
//                    max = arr[i];
//                }
//            }
//            return max;
//        }
//
//        // Count Sort function
//        static void countSort(int[] arr) {
//            int max = max(arr);           // Find maximum value
//            int[] count = new int[max + 1]; // Count array
//
//            // Count occurrences of each element
//            for (int i = 0; i < arr.length; i++) {
//                count[arr[i]]++;
//            }
//
//            // Fill back the original array in sorted order
//            int k = 0;
//            for (int i = 0; i < count.length; i++) {
//                for (int j = 0; j < count[i]; j++) {
//                    arr[k++] = i;
//                }
//            }
//        }
//
//        public static void main(String[] args) {
//            int[] arr = {1, 4, 5, 2, 2, 5, 6};
//            System.out.println("Original Array:");
//            displayArr(arr);
//
//            countSort(arr);
//
//            System.out.println("After Count Sort:");
//            displayArr(arr);
//        }
//    }
//
//}
