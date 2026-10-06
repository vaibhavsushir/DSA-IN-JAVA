 class Binary_Search {
    static boolean BinarySearch(int[] arr,int target){
        int n = arr.length;
        int st=0,end=n-1;
        while(st<=end){
            int mid = st + (end-st)/2;
            if(arr[mid] == target){
                return true;
            }else if(target < arr[mid]){
                end = mid-1;
            }else{
                st=mid+1;
            }
        }

        return false;
    }

     public static void main(String[] args) {
         int[] arr ={1,3,6,7,8,9,12,25,37,64,82,91,94};
         int target = 37;
         boolean BinarySearch =BinarySearch(arr,target);
         System.out.println("Target Is Ans "+BinarySearch);
     }
}
