import java.util.Scanner;
class SOD_Recursion {

    static int sod(int num){
        //Base Case
        if(num >= 0 && num <= 9){
            return num;
        }
        //Recursion Work
        int smallans = sod(num / 10);

        //Self Work
        int ans = smallans + num % 10;
        return ans;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Number: ");
        int num = input.nextInt();
    }
}
