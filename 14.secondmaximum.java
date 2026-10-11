import java.util.Scanner;
 class secondmaximum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Array Size: ");
        int n = input.nextInt();
        int[] numarr = new int[n];
        System.out.println("Enter "+n+" Elements: ");
        for(int i=0; i< n; i++){
            numarr[i] = input.nextInt();
        }
        int num = input.nextInt();
        int secondmax = secondmax(numarr);
        System.out.println(secondmax);
    }
    public static int findmax(int[] numarr){
        int max = Integer.MIN_VALUE;
        for(int i=0; i < numarr.length; i++){
            if(numarr[i] > max){
                max = numarr[i];
            }
        }
        return max;
    }
    public static int secondmax(int[] numarr){
        int mx = findmax(numarr);
        for(int i=0; i < numarr.length; i++){
        if(numarr[i] == mx){
            numarr[i] = Integer.MIN_VALUE;
        }

        }
        int second = findmax(numarr);
        return second;
    }
}
