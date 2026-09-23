class Selection_Sort {
    static void sort(int[] arr){
        for(int i=0; i<arr.length-1;i++){
            int minidx = i;
            for(int j= i+1;j< arr.length;j++){
                if(arr[j]<arr[minidx]){
                    minidx = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[minidx];
            arr[minidx] = temp;
        }
    }

    public static void main(String[] args) {
        int[] a ={3,5,2,7,1,8,0};
        sort(a);
        for(int i:a){
            System.out.print(i+" ");
        }
    }

}
