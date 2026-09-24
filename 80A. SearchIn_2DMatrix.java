class SearchIn_2DMatrix {

    static boolean search(int[][] arr,int target){
        int n= arr.length;
        int m=arr[0].length;
        int st=0;
        int end = n*m-1;
        while (st<=end){
            int mid = st +(end-st)/2;
            int num = arr[mid/m][mid%m];
            if(num==target) return true;
            if(target < num  ){
                end = mid-1;
            }else{
                st = mid+1;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[][] arr ={{1,3,5,7},{10,11,16,20},{23,30,34,60}};
        boolean isfound = search(arr,16);
        System.out.println(isfound);
    }
}
