import java.util.Scanner;
class GCD_Basic {
    static int lowest(int num1,int num2){
        if(num1 < num2){
            return num1;
        }else{
            return num2;
        }
    }
static int gcd(int num1,int num2){
        int lowest = lowest(num1,num2);
    for(int i=lowest; i>=1 ; i--){
        if(num1 % i==0 && num2 % i==0){
            return i;
        }
    }
    return 0;
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
