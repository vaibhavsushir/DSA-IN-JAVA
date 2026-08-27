import java.util.Scanner;

class Rotation_90 {
    static void printarray(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");
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
    }

    static void reversearray(int[] arr){
        int i=0; int j= arr.length-1;

        while(i<j) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
    }
    static void rotate(int[][] arr,int n) {
     transpose(arr,n,n);
        for (int i = 0; i < arr.length; i++) {
            reversearray(arr[i]);
        }
        printarray(arr);
    }

}

