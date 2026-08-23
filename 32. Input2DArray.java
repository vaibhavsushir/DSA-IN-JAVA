import java.util.Scanner;
class Input2DArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Rows: ");
        int r = input.nextInt();
        System.out.print("Enter Column: ");
        int c = input.nextInt();
        int[][] arr = new int[r][c];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print("arr["+i+"]["+j+"] = ");
                arr[i][j] = input.nextInt();
            }
        }
        System.out.println("Your Array Is: ");
        printarr(arr);
    }
       static  int[][] printarr(int[][] arr) {
           for (int i = 0; i < arr.length; i++) {
               for (int j = 0; j < arr[i].length; j++) {
                   System.out.print(arr[i][j] + " ");
               }
               System.out.println();
           }
           return arr;
       }
}
