package searching;

//Search in Rotated Sorted Array
public class SearchInRoatatingArray {

    public static void main(String[] args) {
        int[] num = { 3, 4, 5, 6, 0, 1, 2 };
        int target = 1;
        int peak = FindPeak(num);
        int left = LeftBinarySearch(num, target, peak);
        int right = RightBinarySearch(num, target, peak);
        int result = (left != -1) ? left : right;
        System.out.println(result);
    }

    static int FindPeak(int[] arr) {
        int start = 0, end = arr.length - 1;
        if (arr[start] <= arr[end])
            return end; // not rotated, whole array ascending
        while (start < end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] > arr[end]) {
                start = mid + 1;
            } else {
                end = mid;
            }
        }
        return start - 1;
    }

    static int LeftBinarySearch(int[] arr, int target, int peak) {
        int start = 0;
        int end = peak;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] == target) {
                return mid;
            } else if (arr[mid] > target) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }

        }
        return -1;

    }

    static int RightBinarySearch(int[] arr, int target, int peak) {
        int start = peak + 1;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] == target) {
                return mid;
            } else if (arr[mid] > target) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }

        }
        return -1;

    }

}
