import java.util.Scanner;
class Recursion_Basic {

        static void fib(int n) {
            int f = 0;
            if(n == 2){
                System.out.println(1);
            }
            f=(n-1) + (n-2);
            System.out.println(f);
            fib(n);
        }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Number: ");
        int num = input.nextInt();
        fib(num);
    }
}
