package searching;
/*find the 1st and last position of the target element 
Ex- arr={1,3,5,7,7,7,8,11}
target=7
output=[3,5]
*/

import java.util.Arrays;

public class FirstandLastDigit {
    public static void main(String[] args) {
        int[] num = { 1, 3, 4, 6, 7, 7, 7, 8, 8, 9, 11, 15, 17, 22 };
        int target = 7;
        int first = FirstBinarySearch(num, target);
        int last = LastBinarySearch(num, target);
        int[] result = { first, last };
        System.out.println(Arrays.toString(result));
    }

    static int FirstBinarySearch(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        int first = -1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] == target) {
                first = mid;
                end = mid - 1;
            } else if (arr[mid] > target) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return first;
    }

    static int LastBinarySearch(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        int last = -1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] == target) {
                last = mid;
                start = mid + 1;
            } else if (arr[mid] < target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return last;
    }

}
