package searching;
import java.util.Arrays;

public class linearsearch2Darray {
    public static void main(String[] args) {
        int[][] num = {
                {12, 5, 6, 78, 3},
                {11, 9, 33, 64, 15, 7},
                {1, 95, 36, 91},
                {4, 62, 84, 52}
        };

        int target = 7;
        System.out.println(Arrays.toString(search(num, target)));
    }

    static int[] search(int[][] arr, int target) {
        if (arr == null || arr.length == 0) {
            return new int[]{-1, -1};
        }

        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                if (arr[row][col] == target) {
                    return new int[]{row, col};
                }
            }
        }
        return new int[]{-1, -1};
    }
}