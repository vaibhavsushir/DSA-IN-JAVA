import java.util.Scanner;

class 1_PrintPrimesInRange{
    public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    printprime(13);
        
    }
    public static void printprime(int n){
        for(int i=2; i<=n; i++){
            if(isprime(i)){
                System.out.print(" "+i);
            }
        }
    }

    public static boolean isprime(int n){
        for(int i=2; i<=Math.sqrt(n); i++){
            if(n%i==0){
                return false;
            }
            return true;
        }
    }
}