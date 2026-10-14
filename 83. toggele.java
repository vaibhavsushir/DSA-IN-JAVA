import java.util.Scanner;

class Toggle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        StringBuilder str = new StringBuilder(input.nextLine());

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch == ' ') continue;
            str.setCharAt(i, (char) ascii);
        }

        System.out.println(str);
    }
}
