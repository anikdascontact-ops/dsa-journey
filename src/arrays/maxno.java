package arrays;

public class maxno {
    public static void main(String[] args) {
        int[] arr = { 12, 15, 45, 66, 17, 86, 19 };
        int result = max(arr);
        System.out.println(result);
    }

    static int max(int[] arr) {
        int maxval = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > maxval) {
                maxval = arr[i];

            }
        }
        return maxval;

    }

}