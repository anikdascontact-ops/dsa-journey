package arrays;
import java.util.Arrays;

public class Changearr {
    public static void main(String[] args) {
        int[] arr = { 1, 5, 45, 36, 50 };
        change(arr);
        System.out.println(Arrays.toString(arr));

    }

    static void change(int[] num) {
        num[0] = 99;

    }

}
