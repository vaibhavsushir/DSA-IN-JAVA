class FindSquareRoot {

    static int squareroot(int num) {
        int ans = -1;
        int st = 0, end = num;

        while (st <= end) {
            int mid = st + (end - st) / 2;
            int val = mid * mid;
            if (val == num) {
                return mid;
            } else if (val > num) {
                end = mid - 1;
            } else {
                st = mid + 1;
                ans = mid;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
       int sr = squareroot(16);
        System.out.println(sr);
    }
}
