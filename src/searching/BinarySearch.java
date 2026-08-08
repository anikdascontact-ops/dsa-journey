package searching;
//works on sorted array only

public class BinarySearch {
    public static void main(String[] args) {
        int[] num = { 1, 3, 5, 9, 11, 12, 15, 16, 18, 19, 21, 25 };
        int target = 9;
        int result = binarysearch(num, target);
        if (target != -1) {
            System.out.println(target+" is at index no :" + result);
        } else {
            System.out.println("Target not found");
        }
    }

    static int binarysearch(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
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

}
