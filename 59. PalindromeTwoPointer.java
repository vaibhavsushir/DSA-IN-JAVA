import java.util.Scanner;
class PalindromeTwoPointer {

    static boolean ispalindrome(String str, int l, int r) {
        if (str.charAt(l) == str.charAt(r) && pal) {
        
    }

        String str = input.next();
        int n = str.length();
        boolean pal = ispalindrome(str, 0, n - 1);
        if (pal) {
            System.out.printf("%s Is Palindrome ", str);
        } else {
            System.out.printf("%s Is Not Palindrome ", str);
        }
    }
}
