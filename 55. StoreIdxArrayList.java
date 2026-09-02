import java.util.Scanner;
import java.util.ArrayList;
            System.out.print(i+" ");
        }
    }
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
