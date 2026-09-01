import java.util.Scanner;
class Fibonacci {
    static int fib(int num){
        if(num == 0 || num ==1){
            return num;
        }
        //Subproblem
        int prev = fib(num-1);
        int prevprev = fib(num-2);
        //Selfwork
        return prev + prevprev;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Number: ");
        int num = input.nextInt();
        for(int i=0 ;i<=num; i++) {
            System.out.println(fib(i));
        }
        }
}
