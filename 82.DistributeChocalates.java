class DistributeChocalates {

    static boolean isdivisionposible(int[] a,int m,int mxchocalates){
    int noofstudents = 1;
    int choc = 0;
    for(int i=0; i<a.length;i++){
        if(a[i] > mxchocalates) return false;
        if(choc+ a[i] <= mxchocalates){
            choc += a[i];
        }else{
            noofstudents++;
            choc = a[i];
        }
    }
    return noofstudents <= m;
    }

    static int distributechocalate(int[] arr,int m){
    if(arr.length < m) return -1;
    int ans=0,st=1,end=(int)1e9;

    while(st <= end){
        int mid = st + (end-st)/2;

        if(isdivisionposible(arr,m,mid)){
            ans = mid;
            end = mid-1;
        }else{
            st=mid+1;
        }
    }
    return ans;
    }

    public static void main(String[] args) {
        int[] arr ={12,34,67,90};
        int m=2;
        System.out.println(distributechocalate(arr,m));

    }
}
