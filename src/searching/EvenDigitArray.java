package searching;
//no of even number of digits  in an array
public class EvenDigitArray {
    public static void main(String[] args) {
        int[] num = {1, 15, 65, 234, 1268, 16545, 15, 3546, 44};
        System.out.println(noofeven(num));
    }

    static int noofeven(int[] arr) {
        int count = 0;

        for (int i = 0; i < arr.length; i++) {
            int digits = noofdigit(arr[i]);
            if (iseven(digits)) {
                count++;
            }
        }

        return count;
    }

    static boolean iseven(int count) {
        return count % 2 == 0;
    }

    static int noofdigit(int num) {
        if (num == 0) return 1;

        int count = 0;
        num = Math.abs(num); // handle negative numbers

        while (num > 0) {
            count++;
            num = num / 10;
        }

        return count;
    }
}