class TripletTargetSum {
    public static void main(String[] args) {
        int[] numarr = {1,2,3,4,5,6,7,8,9,10};
        int target = 14;
        int TT =tripletsum(numarr,target);
        System.out.println("Total Number Of Triplets Is: "+TT);

    }
    public static int tripletsum(int[] numarr,int target){
        int total = 0;
        for(int i=0; i< numarr.length; i++){
            for(int j=i+1; j< numarr.length; j++){
                for(int k=j+1; k < numarr.length; k++){
                    if(numarr[i] + numarr[j] + numarr[k] == target){
                        total = total + 1;
                    }
                }
            }
        }
return total;
    }
}
