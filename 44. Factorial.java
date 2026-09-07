import java.util.Scanner;
class Factorial {

    static int factorial(int num){
        if(num == 0) {
            return 1;
        }
        int smallans = factorial(num-1);

        int ans = num * smallans;
        return ans;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Number: ");
        int num = input.nextInt();
        System.out.println("Factorial Is "+factorial(num));
    }
}
