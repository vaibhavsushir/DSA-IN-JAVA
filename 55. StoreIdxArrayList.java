import java.util.Scanner;
import java.util.ArrayList;
class StoreIdxArrayList {
    static void printarr(ArrayList<Integer> list){
        for(int i : list){
            System.out.print(i+" ");
        }
    }
    static ArrayList<Integer> AllIndice(int[] arr,int target,int idx) {
        int n = arr.length;
        ArrayList<Integer> ans = new ArrayList<>();
        if (idx >= n) {
            return ans;
        }
        if (arr[idx] == target) {
            ans.add(idx);
        }
        ArrayList<Integer> smallans = AllIndice(arr, target, idx + 1);
        ans.addAll(smallans);
        return ans;
    }


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] arr = {1, 2, 3,1, 4, 5,1,4};
        System.out.print("Enter Target: ");
        int target = input.nextInt();
        System.out.print("Enter idx: ");
        int idx = input.nextInt();
        ArrayList<Integer> AI=AllIndice(arr, target, idx);
        printarr(AI);
    }
}
