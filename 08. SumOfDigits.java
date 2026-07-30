import java.util.Scanner;
 class SumOfDigits {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Your Number: ");
        int num = input.nextInt();
        int sum = sumofdigits(num);
        System.out.println("Sum Of Digits Is: "+sum);
    }
    public static int sumofdigits(int num){
        int sum = 0;
        while(num > 0){
            sum = sum + num % 10;
            num /= 10;
        }
        return  sum;
    }
}
