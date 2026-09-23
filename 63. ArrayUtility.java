import java.util.Scanner;
class ArrayUtility {
        Scanner input = new Scanner(System.in);

        public static void printarray(int[] arr) {
            for (int i = 0; i < arr.length; i++) {
                System.out.print(arr[i] + " ");
            }
            System.out.println();
        }
        public static int[] takingarray() {
            Scanner input = new Scanner(System.in);
            System.out.print("Enter Size Of Array: ");
            int size = input.nextInt();
            int[] ans = new int[size];
            System.out.println("Enter " + size + " Elements: ");
            for (int i = 0; i < size; i++) {
                ans[i] = input.nextInt();
            }
            return ans;
        }
    }

