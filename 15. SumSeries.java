import java.util.Scanner;
 class SumSeries {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Number Till You Want Sum : ");
        int num = input.nextInt();

        int sum = 0;
        for( int i = 1 ; i <= num ; i++){
            if( i % 2 == 0){
                sum = sum - i ;
            }else{
                sum = sum + i;
            }
        }
        System.out.println(sum);

    }
}
