import java.util.Scanner;
 class Transpose_Matrix {
     static void printarray(int arr[][]) {
         for (int i = 0; i < arr.length; i++) {
             for (int j = 0; j < arr[i].length; j++) {
                 System.out.print(arr[i][j] + " ");
             }
             System.out.println();
         }
     }
     static void transpose(int[][] arr,int r1,int c1) {
         for (int i = 0; i < c1; i++) {
             for (int j = i; j < r1; j++) {
                 int temp = arr[i][j];
                 arr[i][j] = arr[j][i];
                 arr[j][i] = temp;
             }
         }
         printarray(arr);
     }

     public static void main(String[] args) {
         Scanner input = new Scanner(System.in);
         System.out.print("Enter Row: ");
         int r1 = input.nextInt();
         System.out.print("Enter Column: ");
         int c1 = input.nextInt();
         int[][] array = new int[r1][c1];
         for (int i = 0; i < r1; i++) {
             for (int j = 0; j < c1; j++) {
                 array[i][j] = input.nextInt();
             }
         }
         System.out.println("Matrix ");
         printarray(array);
         System.out.println("Transpose");
         transpose(array,r1,c1);
     }
}
