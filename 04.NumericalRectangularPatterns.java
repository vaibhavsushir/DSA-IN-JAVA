import java.util.Scanner;
 class NumericalRectangularPatterns {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter R: ");
        int r = input.nextInt();


        for(int i = 1; i <= r; i++){
            for(int j = i; j <= r ; j++){
                System.out.print(j);
            }
            for(int k = 1; k <= i - 1; k++){
                System.out.print(k);
            }
            System.out.println();
        }
    }
}
