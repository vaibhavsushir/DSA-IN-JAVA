import java.sql.SQLOutput;
import java.util.Scanner;
class Multiples {

    static void multiples(int num,int k){
        if(k==1){
            System.out.println(num);
            return ;
        }
      multiples(num,k-1);
        System.out.println(num*k);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Number: ");
        int num = input.nextInt();
        System.out.print("Enter K: ");
        int k = input.nextInt();
         multiples(num,k);
    }
}
