import java.util.Scanner;
class CheckPalindrome {

    static String reverse(String str,int idx){
        if(idx == str.length()) return "";

        String smallans = reverse(str,idx+1);
        char currchar = str.charAt(idx);
        return smallans+currchar;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter String: ");
        String str = input.next();
        String rev = reverse(str,0);
        if(rev.equals(str)){
            System.out.printf("%s Is Palindrome ",str);
        }else{
            System.out.printf("%s Is Not Palindrome ",str);
        }

    }
}
