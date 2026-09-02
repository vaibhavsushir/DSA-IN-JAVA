import java.util.Scanner;
class GCD_Main {

//    static int gcd(int num1,int num2) {
//        while (num1 % num2 != 0) {
//            int rem = num1 % num2;
//            num1 = num2;
//            num2 = rem;
//        }
//        return num2;
//    }

    static int gcd(int num1,int num2){
        if(num2 == 0){
            return num1;
        }
        return gcd(num2,num1%num2);
    }


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter 1st Number: ");
        int num1 =input.nextInt();
        System.out.print("Enter 2nd Number: ");
        int num2 =input.nextInt();
        int gcd = gcd(num1,num2);
        System.out.println("GCD Is "+ gcd);

    }
}


