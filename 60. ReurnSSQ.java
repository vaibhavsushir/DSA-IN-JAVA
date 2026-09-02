import java.util.ArrayList;
import java.util.Scanner;
class ReurnSSQ {

    static ArrayList<String> getSSQ(String s){ayList<>();
        if(s.length
        char curr = s.charAt(0);
        ArrayList<String> smallans = getSSQ(s.substring(1));
        for(String ss : smallans){
            ans.add(ss);
            ans.add(curr+ss);
        }
        return ans;
    }

    public static void main(String[] args) {
        ArrayList<String> list = getSSQ("abc");
        for(String ss: list){
            System.out.println(ss);
        }
    }
}
