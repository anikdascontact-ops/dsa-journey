package arrays;
import java.util.Arrays;

public class funinarray {
    public static void main(String[] args) {
        int[] num = { 5, 9, 6, 2, 7 };
        System.out.println(Arrays.toString(num));
        change(num);
        System.out.println(Arrays.toString(num));
    }

    static void change(int[] arr) {
        arr[1] = 3;
    }

}
