import java.util.Scanner;
 class FindTotalTargetSum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] numarr = {1,2,3,4,5,6,7,8};
        int target = 7;
        int totaltarget = totaltargetsum(numarr,target);
        System.out.println("Total Number Of Target Found Is: "+totaltarget);
    }
    public static int totaltargetsum(int[] numarr,int target){
        int total = 0;
        for(int i=0; i < numarr.length; i++){
            for(int j=i+1; j < numarr.length; j++){
                if(numarr[i] + numarr[j] == target ){
                    total = total + 1;
                }
            }
        }
        return total;
    }
}
