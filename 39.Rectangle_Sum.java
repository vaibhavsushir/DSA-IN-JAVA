import java.util.Scanner;
 class Rectangle_Sum{
     static void printarr(int[][] arr){
         for(int i=0; i< arr.length; i++){
             for(int j=0; j<arr[i].length; j++){
                 System.out.print(arr[i][j]+" ");
             }
             System.out.println();
         }
     }
     static int findsum(int[][] matrix, int l1, int r1, int l2, int r2){
     int sum = 0;
     for(int i=l1; i<=l2; i++){
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
        System.out.println("Matrix");
        printarr(array);
        System.out.println("Enter Rectangle Boundaries as l1,r1,l2,r2");
        int l1 = input.nextInt();
        int r1 = input.nextInt();
        int l2 = input.nextInt();
        int r2 = input.nextInt();

        System.out.println("Matrix Sum Is: " + findsum(array,l1, r1, l2, r2));
    }
}
