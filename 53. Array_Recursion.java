import java.util.Scanner;
class Array_Recursion {

    static void arrprint(int[] arr,int idx) {
        if (idx == arr.length) {
            return ;
        }        arrprint(arr,idx+1);

    }
        if(idx == arr.length-1){
            return arr[idx];
        }
        int smallans = max(arr,idx+1);

        return Math.max(arr[idx],smallans);
        int max = max(arr,idx);
        System.out.println("Maximum Is "+max);
    }
}
