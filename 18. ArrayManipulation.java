class ArrayManipulation {
    public static void main(String[] args) {
        int[] numarr = {1, 2, 3, 4, 2, 1, 3,5,4,6,4,9};
        int unique = unique(numarr);
        System.out.println("Your Unique Number Is: "+unique);

    }

    public static int unique(int[] numarr) {
        int ans = 0;
        for (int i = 0; i < numarr.length; i++) {
            for (int j = i + 1; j < numarr.length; j++) {
                if (numarr[i] == numarr[j]) {
                    numarr[i] = 0;
                    numarr[j] = 0;
                }
            }
        }
        for (int i = 0; i < numarr.length; i++) {
           if(numarr[i] > 0){
                ans = numarr[i];

            }
        }
        return ans;
    }
}

