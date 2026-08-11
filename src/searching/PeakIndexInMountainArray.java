package searching;

/*You are given an integer (confirmed)mountain array/Bitonic array arr  of length n where the values 
increase to a peak element and then decrease.Return the index of the peak element.*/
public class PeakIndexInMountainArray {
    public static void main(String[] args) {
        int[] num = { 0, 1, 3, 4, 5, 6, 7, 8, 9, 11, 15,16, 17, 15, 11, 10, 8, 5, 4, 2, 1, 0 };
        int result = BinarySearch(num);
        System.out.println(result);
    }

    static int BinarySearch(int[] arr) {
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

}
