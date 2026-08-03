import java.util.Scanner;
 class ReverseNo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Your Number: ");
        int num = input.nextInt();
        int reverse = reverse(num);
        System.out.println("Your Reverse Number Is "+reverse);
    }
    public static int reverse(int num){
        int reverse = 0;
        while(num > 0){
            reverse = reverse * 10 + num % 10;
            num /= 10;
        }
        return reverse;
    }
}
