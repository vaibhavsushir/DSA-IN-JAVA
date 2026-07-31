import java.util.Scanner;
 class CountNoDigits {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Your Number: ");
        int num = input.nextInt();
        int count = noofdigits(num);
        System.out.println("Your Number Of Digits Is: "+count);
    }
    public static int noofdigits(int num){
        int NOD = 0;
        while(num > 0){
            NOD += 1;
            num /= 10;
        }
        return  NOD;
    }
}
