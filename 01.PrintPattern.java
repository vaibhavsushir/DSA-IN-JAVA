import java.util.Scanner;
class PrintPattern {
    public static void main(String[] args) {
        System.out.println("This Program Create Patterns\n");
        Scanner input = new Scanner(System.in);
        int r = input.nextInt();
        int c = input.nextInt();
        System.out.println("For Rectagular\n");            for( int j =1; j <= c;j++){
                System.out.                for (int i = 1; i <= r; i++) {
            for (int j = 1; j <= c; j++) {                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
