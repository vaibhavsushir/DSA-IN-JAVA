import java.util.Scanner;
class Power {

//    static int power(int p, int q){
//        if(q == 0) return 1;
//
//        int smallans = power(p,q-1);
//
//        return smallans * p;
//
//    }

    static int power(int p, int q){
        if(q==0) return 1;
        int smallans = power(p,q/2);
        if(q % 2 == 0){
            return smallans * smallans;
        }else{
            return p*smallans*smallans;
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Anwser Is "+power(2,5));
    }
}
