import java.util.Scanner;
 class occorences {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] numarr = {1,2,3,3,4,5,6,3};

            System.out.print("Enter Element You Want To Check Occ: ");
            int num = input.nextInt();
            int occ = occ(numarr,num);
            System.out.println("Your Number Found "+occ+" Times");
        }
    public static int occ(int[] numarr,int num){
        int occ = 0;
        for(int i = 0;i < numarr.length;i++){
            if(numarr[i] == num){
                occ = occ + 1;
            }
        }
        return occ;
    }
}
