package searching;
//letter that is greater than the target element but less than other elements
//wrap around=like circle
public class CeilingOfaWord {
    public static void main(String[] args) {
        char[] ch = { 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h' };
        char target = 'c';
        char result = Ceiling(ch, target);
        System.out.println("Ceiling of " + target + " is :" + result);
    }

    static char Ceiling(char[] arr, char target) {
        int start = 0;
        int end = arr.length - 1;
        char ans = '\0';   //Null
        if (target >= arr[arr.length - 1]) {
            return arr[0]; //wrap around
        }
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] > target) {
                ans = arr[mid];
                end = mid - 1;
            } else {
                start = mid + 1;
            }

        }
        return ans;
    }

}
