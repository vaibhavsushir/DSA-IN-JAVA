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

//    static void PrintDecreasing(int num){
//        if(num == 1){
//            System.out.println("1");
//            return;
//        }
//        System.out.println(num);
//        PrintDecreasing(num-1);
//    }
//    static void PrintIncreasing(int num){
//        if(num == 1){
//            System.out.println("1");
//            return;
//        }
//        PrintIncreasing(num-1);
//        System.out.println(num);
//    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Number: ");
        int num = input.nextInt();
        fib(num);
    }
}
