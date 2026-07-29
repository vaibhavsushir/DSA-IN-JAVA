import java.util.Scanner;
 class UpperPyramid {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int r = input.nextInt();
        for (int i = 1; i <= r; i++) {
            for (int j = 1; j <= (r + 1 - i); j++) {
                    System.out.print("*");
                }
                    System.out.println();
                }

            }
    }

