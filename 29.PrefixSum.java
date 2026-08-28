import java.util.Scanner;
 class PrefixSum {
     public static void main(String[] args) {
         System.out.println("Welcome To Prefix Sum\n");
         int[] arr = ArrayUtility.takingarray();
         System.out.println("Original Array Is: ");
         ArrayUtility.printarray(arr);
         int[] prefixsum = prefixsum(arr);
         System.out.println("Prefix Sum Array Is");
         ArrayUtility.printarray(prefixsum);
     }
     static int[] prefixsum(int[] arr){
         int n = arr.length;
         for(
