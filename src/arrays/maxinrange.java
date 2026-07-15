package arrays;
//max element in a range
public class maxinrange {
    public static void main(String[] args) {
        int[] arr = { 12, 15, 45, 66, 17, 86, 19 };
        int result = maxinRange(arr, 1, 3);
        System.out.println(result);
    }

    static int maxinRange(int[] arr, int start, int end) {
        int maxval = arr[start];
        for (int i = start; i < end; i++) {
            if (arr[i] > maxval) {
                maxval = arr[i];

            }
        }
        return maxval;

    }

}