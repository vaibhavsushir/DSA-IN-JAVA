import java.util.Scanner;
class PrintPattern {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int r = input.nextInt();
        int c = input.nextInt();
        System.out.println("For Rectagular\n");
        for(int i = 1; i <= r; i++ ){
            for( int j =1; j <= c;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println("For Boarder");
        for (int i = 1; i <= r; i++) {
            for (int j = 1; j <= c; j++) {
                if (i == 1 || i == r || j == 1 || j == c) {
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }

            }
            System.out.println();
        }
    }
}
