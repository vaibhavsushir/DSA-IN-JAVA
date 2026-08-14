import java.util.Scanner;
 class RotateArray {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int[] numarr = {1,2,3,4,5};
        System.out.print("Enter How Many Rotation You Perform: ");
        int k = input.nextInt();
        System.out.println("Original Array: ");
        printarray(numarr);
        int[] ans = rotate(numarr,k);
        System.out.println("Array After Rotate");
        printarray(ans);
    }
    public static void printarray ( int[] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    static int[] rotate(int[] numarr,int k){
        int n = numarr.length;
        int j = 0;
        k = k % n;
        int[] ans = new int[n];
        for(int i = n-k; i < n; i++){
            ans[j++] = numarr[i];
        }
        for(int i = 0; i < n-k; i++){
            ans[j++] = numarr[i];
        }
        return ans;
    }
}
