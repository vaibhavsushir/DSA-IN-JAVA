import java.util.Scanner;
class Series_Sum {

    static int seriessum1(int num) {
        if (num == 0) {
            return 0;
        }
        if (num % 2 == 0) {
            return seriessum1(num - 1) - num;
        } else {
            return seriessum1(num - 1) + num;
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Number: ");
        int num =input.nextInt();
        int sum = seriessum1(num);
        System.out.println("Series Sum Is "+sum);
    }
}
