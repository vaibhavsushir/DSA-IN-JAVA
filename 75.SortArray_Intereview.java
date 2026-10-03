class SortArray_Intereview {
    static void sort(int[] arr){
        int n=arr.length;
        int x=-1,y=-1;
    if(n <= 1) return;
        for(int i=1;i<n;i++){
            if(x==-1){
                x=i-1;
                y=i;
            }else {
                y=i;
            }
        }
        int temp = arr[x];
        arr[x]=arr[y];
        arr[y]=temp;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,4,3,5,8,7};
        sort(arr);
    for(int i:arr){
        System.out.print(i+" ");
    }
    }
}
