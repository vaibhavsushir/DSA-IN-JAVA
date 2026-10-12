 class PeakIndexInMountainInArray {
    static int PIMA(int[] arr){
        int st=0,end= arr.length-1;
        int ans=-1;
        while (st<end){
            int mid = st +(end-st)/2;
            if(arr[mid] < arr[mid+1]){
                ans = mid+1;
                st=mid+1;
            }else{
                end=mid-1;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] arr={0,1,0};
        System.out.println(PIMA(arr));
    }

}
