class SortZeroArray {
    public static void main(String[] args) {
        int[] arr = {0, 1, 1, 0, 1, 0, 0, 0, 1,0,0,1};
        sort(arr);
        ArrayUtility.printarray(arr);

    }
    static void sort(int[] arr) {
        int zeroes = 0;
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            if (arr[i] == 0) {
                zeroes++;
            }
        }
            for (int i = 0; i < n; i++) {
                if (i < zeroes) {
                    arr[i] = 0;
                } else {
                    arr[i] = 1;
                }

            }
        }
    }


