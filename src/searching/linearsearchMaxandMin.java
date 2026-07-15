package searching;

import java.util.Arrays;

public class linearsearchMaxandMin {
    public static void main(String[] args) {
        int[] num = { 1, 55, 99, 66, 11, 44, 51, 65, 82, 62, 16, 45, 81, 68 };

        System.out.println(Arrays.toString(maxmin(num)));
    }

    static int[] maxmin(int[] arr) {
        int max = arr[0];
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
            if (arr[i] < min) {
                min = arr[i];
            }

        }
        return new int[] { max, min };

    }

}
