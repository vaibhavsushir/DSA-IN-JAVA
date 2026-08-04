import java.util.Scanner;
 class FirstRepeat {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Array Size: ");
        int n = input.nextInt();
        int[] numarr = new int[n];
        System.out.println("Enter "+n+" Elements: ");
        for(int i=0; i< n; i++){
            numarr[i] = input.nextInt();
        }
        int FR = firstrepeat(numarr);
        System.out.println("First Repeated Value Is: "+FR);
    }
    public static int firstrepeat(int[] numarr){
        int num = -1;
        for(int i=0; i < numarr.length; i++){
            for(int j = i+1 ; j < numarr.length; j++){
                if(numarr[i] == numarr[j]){
                    return numarr[i];
                }
                }
            }
        return -1;
        }

    }
