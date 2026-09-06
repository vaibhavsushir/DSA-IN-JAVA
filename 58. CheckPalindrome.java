import java.util.Scanner;
class CheckPalindrome {

    static String reverse(String str,int idx){
        if(idx == str.length()) return "";

        String smallans = reverse(str,idx+1);
        char currchar = str.charAt(idx);
        return smallans+currchar;
    
    }
}
