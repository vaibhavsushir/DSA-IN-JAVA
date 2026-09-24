class BubbleSort {

    static void sort(int[] arr){
        int n = arr.length;
        boolean flag  = false;
        for(int i=0; i<n-1; i++){
            for(int j=0; j<n-1-i;j++){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    flag = true;
                }
            }
            if(flag == false){
                return;
            }
        }
    }


    public static void main(String[] args) {
        int[] a = {7,6,5,4,3,78,65,78,99,45};
        sort(a);
        for(int i: a){
            System.out.print(i+" ");
        }

    }
}
