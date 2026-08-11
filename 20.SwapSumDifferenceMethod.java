class SwapSumDifferenceMethod {
    public static void main(String[] args) {
        System.out.println("Before Swap");
        int a = 9;
        int b = 3;
        System.out.println("Before Swap: a = "+a+" And b = "+b);
        swap(a,b);

    }
    static void swap(int a, int b){
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println("After Swap: a = "+a+" And b = "+b);
    }
}
