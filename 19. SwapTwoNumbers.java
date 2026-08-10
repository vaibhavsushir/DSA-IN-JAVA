class SwapTwoNumbers {
    public static void main(String[] args) {
        int a = 3;
        int b = 9;
        System.out.println("Before Swap : a = "+a+" And b = "+b);
        int temp = a;
        a = b;
        b = temp;
        System.out.println("After Swap : a = "+a+" And b = "+b);
    }

}
