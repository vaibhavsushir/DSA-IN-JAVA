import java.util.Scanner;
 class Spiral_Matrix {
     static void printarr(int[][] arr){
         for(int i=0; i< arr.length; i++){
             for(int j=0; j<arr[i].length; j++){
                 System.out.print(arr[i][j]+" ");
             }
             System.out.println();
         }
     }

     static void printsoiralOrder(int[][] arr,int r,int c) {
         int toprow = 0, bottomrow = r - 1, leftcol = 0, rightcol = c - 1;
         int totalele = 0;
         while (totalele < r * c) {
             // toprow = leftcol to rightcol
             for (int j = leftcol; j <= rightcol; j++) {
                 System.out.print(arr[toprow][j] + " ");
                 totalele++;
             }
             toprow++;
             // rightcol = toprow to bottomrow
             for (int i = toprow; i <= bottomrow; i++) {
                 System.out.print(arr[i][rightcol] + " ");
                 totalele++;
             }
             rightcol--;

             // bottomrow = rightcol to leftcol
             for (int j = rightcol; j >= leftcol; j--) {
                 System.out.print(arr[bottomrow][j] + " ");
                 totalele++;
             }
             bottomrow--;
             // leftcol = bottomrow to toprow

             for (int i = bottomrow; i >= toprow; i--) {
                 System.out.print(arr[i][leftcol] + " ");
                 totalele++;
             }
             leftcol++;
         }
     }

     public static void main(String[] args) {
         Scanner input = new Scanner(System.in);
         System.out.print("Enter Row: ");
         int r = input.nextInt();
         System.out.print("Enter Column: ");
         int c = input.nextInt();
         int[][] array = new int[r][c];
         for (int i = 0; i < r; i++) {
             for (int j = 0; j < c; j++) {
                 array[i][j] = input.nextInt();
             }
         }
         System.out.println("Matrix ");
         printarr(array);
         System.out.println("Spiral Order Is");
         printsoiralOrder(array,r,c);
     }
}
