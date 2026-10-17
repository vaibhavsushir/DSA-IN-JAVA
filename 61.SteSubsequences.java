import java.util.ArrayList;

class SteSubsequences {
        static ArrayList<String> setssq(String s){
            ArrayList<String> ans = new ArrayList<>();
            if(s.length() == 0){
                ans.add(" ");
                return ans;
            }
            char currchar = s.charAt(0);
            ArrayList<String> smallans = setssq(s.substring(1));
            for(String ss: smallans) {
                ans.add(ss);
                ans.add(currchar + ss);
            }
            return ans;
        }

        public static void main(String[] args) {
            ArrayList<String> ans = setssq("abc");
            for(String ss:ans){
                System.out.println(ss);
            }

        }
    }

