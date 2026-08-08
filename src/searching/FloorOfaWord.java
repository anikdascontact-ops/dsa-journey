package searching;

//letter that is smaller than the target element but greater than other elements
//wrap around=like circle
public class FloorOfaWord {
    public static void main(String[] args) {
        char[] ch = { 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h' };
        char target = 'c';
        char result = Ceiling(ch, target);
        System.out.println("Ceiling of " + target + " is :" + result);
    }

    static char Ceiling(char[] arr, char target) {
        int start = 0;
        int end = arr.length - 1;
        char ans = '\0'; // Null
        if (target <= arr[0]) {
            return arr[arr.length - 1]; // wrap around
        }
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] < target) {
                ans = arr[mid];
                start = mid + 1;
            } else {
                end = mid - 1;
            }

        }
        return ans;
    }

}
