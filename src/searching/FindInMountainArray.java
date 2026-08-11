package searching;

public class FindInMountainArray {

    public static void main(String[] args) {
        int[] num = { 0, 1, 3, 4, 5, 6, 7, 8, 5, 4, 2, 1, 0 };
        int target = 4;
        int peak = BinarySearch(num, target);
        int left = LeftSearch(num, target, peak);
        int right = RightSearch(num, target, peak);
        int result = (left != -1) ? left : right;
        System.out.println(result);
    }

    static int BinarySearch(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

        while (start < end) {
            int mid = start + (end - start) / 2;

            if (arr[mid] > arr[mid + 1]) {
                end = mid;

            } else {
                start = mid + 1;
            }

        }
        return start;

    }

    static int LeftSearch(int[] arr, int target, int peak) {
        int start = 0;
        int end = peak;
        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (arr[mid] == target) {
                return mid;

            } else if (arr[mid] < target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }

        }
        return -1;

    }

    static int RightSearch(int[] arr, int target, int peak) {
        int start = peak;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (arr[mid] == target) {
                return mid;

            } else if (arr[mid] > target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }

        }
        return -1;

    }

}
