import java.util.Scanner;
 class RotateArrayInPlace {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] arr = {1, 2, 3, 4, 5, 6};
        System.out.print("Enter Rotation: ");
        int k = input.nextInt();
        System.out.println("Original Array");
        printarray(arr);
        System.out.println("After Rotation");
        rotateinplace(arr,k);
        printarray(arr);

    }

    public static void printarray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    static void rotateinplace(int[] arr, int k) {
        int n = arr.length;
        k = k % n;
        reverse(arr, 0, n - k - 1);
        reverse(arr, n - k, n - 1);
        reverse(arr, 0, n - 1);
    }


    static void reverse(int[] arr, int i, int j) {
        while (i < j) {
            swap(arr, i, j);
            i++;
            j--;
        }
    }

    static void swap(int[] arr, int i, int j) {
            int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
        }
    }
