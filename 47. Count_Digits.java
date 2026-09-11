import java.util.Scanner;
class Count_Digits {
    static int count(int num) {
        if (num > 0 && num <= 9) {
            return 1;
        }
        int smallans = count(num / 10)+1;
        return smallans;
    }

    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
        System.out.print("Enter num: ");
        int num = input.nextInt();
        System.out.println("Counts IS " +count(num));
    }
}
