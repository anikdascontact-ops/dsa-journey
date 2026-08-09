package searching;

public class PositionInIfiniteArray {
    public static void main(String[] args) {

        int[] num = { 1, 3, 4, 6, 7, 8, 9, 11, 15, 17, 22, 23, 25, 45, 55, 66, 77, 78, 79, 90, 101 };
        int target = 7;
        int result = BinarySearch(num, target);
        System.out.println(result);
    }

    static int BinarySearch(int[] arr, int target) {
        int start = 0;
        int end = 1;
        while (target > arr[end]) {
            start = end + 1;
            end = end * 2;
        }

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
