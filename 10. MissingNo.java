 class MissingNo {
    public static void main(String[] args) {
       int[] nums= {1,2,4,5};
       missingNumber(nums);
    }
    public static int missingNumber(int[] nums) {
        int num = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == (i + 1)) {
//                System.out.println("Hi");
            }else{
                num = i + 1;
//                System.out.println(num);
                return num;
//                break;
            }
        }
        return num;
    }
}
