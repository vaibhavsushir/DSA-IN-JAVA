class SubSetSum {
    static void substesum(int[] arr,int n, int idx,int sum){
        if(idx>=n){
            System.out.println(sum);
            return;
        }
        substesum(arr,n,idx+1,sum+arr[idx]);
        substesum(arr,n,idx+1,sum);
    }
    public static void main(String[] args) {
        int[] a ={2,4,5};
        substesum(a,a.length,0,0);
    }
}
