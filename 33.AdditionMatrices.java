import java.util.Scanner;
 class AdditionMatrices{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter First Matrix");
        System.out.print("Enter Rows: ");
        int r1 = input.nextInt();
        System.out.print("Enter Column: ");
        int c1 = input.nextInt();
        int[][] arr = new int[r1][c1];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print("arr[" + i + "][" + j + "] = ");
                arr[i][j] = input.nextInt();
            }
        }
        System.out.println("Enter Second Matrix");
        System.out.print("Enter Rows: ");
        int r2 = input.nextInt();
        System.out.print("Enter Column: ");
        int c2 = input.nextInt();
        int[][] arr2 = new int[r2][c2];
        for (int i = 0; i < arr2.length; i++) {
            for (int j = 0; j < arr2[i].length; j++) {
                System.out.print("arr[" + i + "][" + j + "] = ");
                arr2[i][j] = input.nextInt();
            }
        }
        System.out.println("Matrix 1 Is");
        int[][] matrix1 = arr;
        printarr(arr);
        System.out.println("Matrix 2 Is");
        int[][] matrix2 = arr2;
        printarr(arr2);
        System.out.println("Addition Matrix Is");
        int[][] add = add(arr, r1, c1, arr2, r2, c2);
        printarr(add);
    }
    static int[][] add( int[][] a, int r1, int c1, int[][] b, int r2, int c2){
                if (r1 != r2 || c1 != c2) {
                    System.out.println("Wrong Input Addition Is Not Possible");
                }

                int sum[][] = new int[r1][c2];
                for (int i = 0; i < r1; i++) {
                    for (int j = 0; j < c1; j++) {
                        sum[i][j] = a[i][j] + b[i][j];
                    }
                }
                return sum;
            }
            static void printarr(int[][] array){
                for (int i = 0; i < array.length; i++){
                    for (int j = 0; j < array[i].length; j++){
                        System.out.print(array[i][j] + " ");
                    }
                    System.out.println();
                }

            }
        }
