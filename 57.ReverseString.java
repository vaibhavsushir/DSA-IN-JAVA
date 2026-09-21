import java.util.Scanner;
class ReverseString {
    static String reverse(String str,int idx){
        if(idx == str.length()) return " ";
        String smallans = reverse(str,idx+1);
        return smallans+str.charAt(idx);
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter String: ");
        String str = input.next();
        String rev = reverse(str,0);
        System.out.println("Reverse String Is "+rev);
    }
}
