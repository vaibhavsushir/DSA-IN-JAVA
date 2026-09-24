class KeypadCombination {
    static void keypadcombination(String s,String[] kp,String res){
        if(s.length() == 0){
            System.out.print(res+" ");
            return;
        }
        int currnum = s.charAt(0) - '0';
        String currchoices = kp[currnum];
        for(int i=0; i<currchoices.length();i++){
            keypadcombination(s.substring(1),kp,res+currchoices.charAt(i));
        }
    }
    public static void main(String[] args) {
        String s = "23";
        String[] kp ={"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
        keypadcombination(s,kp," ");
    }
}
