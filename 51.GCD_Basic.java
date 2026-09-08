import java.util.Scanner;
class GCD_Basic {
    static int lowest(int num1,int num2){
        if(num1 < num2){
            return num1;
        }else{
            return num2;
        }
    }
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
