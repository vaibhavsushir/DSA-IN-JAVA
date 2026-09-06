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
