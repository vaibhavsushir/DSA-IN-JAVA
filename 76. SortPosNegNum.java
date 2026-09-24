class SortPosNegNum {

    static void displayarr(int[] arr) {
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
    static void sort(int[] arr){
        int l=0,r= arr.length-1;
        while (l<r) {
            while(arr[l] < 0) l++;
            while (arr[r] >= 0) r--;
            if(l<r){
                int temp = arr[l];
                arr[l] = arr[r];
                arr[r] = temp;
                l++;
                r--;
            }

        }
    }


    public static void main(String[] args) {
        int[] num ={-13,20,7,0,-4,-13,11,-5,-13};
        sort(num);
        displayarr(num);
    }
}
