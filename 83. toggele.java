import java.util.Scanner;

class Toggle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        StringBuilder str = new StringBuilder(input.nextLine());

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch == ' ') continue;

            int ascii = (int) ch;
            if (ascii >= 97 && ascii <= 122) { // lowercase
                ascii -= 32; // convert to uppercase
            } else if (ascii >= 65 && ascii <= 90) { // uppercase
                ascii += 32; // convert to lowercase
            }

            str.setCharAt(i, (char) ascii);
        }

        System.out.println(str);
    }
}
