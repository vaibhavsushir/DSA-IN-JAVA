import java.sql.SQLOutput;
import java.util.Scanner;
class RemovesOccurences {

    static String remove(String s,int idx){
        String an
        if(idx == n){
            return " ";
        }
        String smallans = remove(s,idx+1);
        char currchar = s.charAt(idx);
        if(currchar != 'a'){
            return currchar+smallans;
        }else{
            return smallans;
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter String: ");
        String s = input.nextLine();
        System.out.println(remove(s,0));
    }
}
