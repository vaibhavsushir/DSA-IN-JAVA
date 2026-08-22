import Java_Revision.ArrayUtility;

import java.util.Scanner;
 class EqualSumPartition {
     public static void main(String[] args) {
         System.out.println("Welcome To Check Array Partition Is Equal\n");
         int[] arr = ArrayUtility.takingarray();
         boolean isequal = equalpartition(arr);
         if(isequal){
             System.out.println("Partition Is Equal");
         }else{
             System.out.println("Partition Is Not Equal");
         }
     }
     static int totalsum(int[] arr){
         int sum = 0;
         for(int i=0; i < arr.length;i++){
             sum += arr[i];
         }
         return sum;
     }
     static boolean equalpartition(int[] arr){
         int totalsum = totalsum(arr);
         int prefixsum = 0;
         for(int i = 0 ; i < arr.length; i++){
              prefixsum = prefixsum + arr[i];
              int suffixsum = totalsum - prefixsum;
              if(suffixsum == prefixsum){
                  return true;
              }
         }
         return false;
     }
}
