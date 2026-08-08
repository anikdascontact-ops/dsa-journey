package searching;
//number that is greater or equal to the target element but less than other elements
public class CeilingOfANumber {
    public static void main(String[] args) {
        int[] num = { 1, 3, 5, 9, 11, 12, 15, 16, 18, 19, 21, 25 };
        int target = 4;
        int result = ceiling(num, target);
        if (result != -1) {
            System.out.println("Ceiling of "+ target +" is :" + result);
        } else {
            System.out.println("Ceiling does not exist");
        }
    }

    static int ceiling(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        int ans = -1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] >= target) {
                ans = arr[mid];
                end = mid - 1;
            } else {
                start = mid + 1;
            }

        }
        return ans;

    }

}
