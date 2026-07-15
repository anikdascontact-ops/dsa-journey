package searching;

public class maxin2Darray {

    public static void main(String[] args) {
        int[][] num = {
            {12, 5, 6, 78, 3},
            {11, 9, 33, 64, 15, 7},
            {1, 95, 36, 91},
            {4, 62, 84, 52}
        };

        System.out.println(maximum(num));

    }

    static int maximum(int[][] arr) {
        if (arr.length == 0) {
            return -1;
        }
        int max = arr[0][0];

        for (int[] arr1 : arr) {
            for (int col = 0; col < arr1.length; col++) {
                if (arr1[col] > max) {
                    max = arr1[col];
                }
            }
        }
        return max;
    }

}
