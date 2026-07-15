package arrays;
import java.util.Arrays;

public class Vararray {
    public static void main(String[] args) {
        fun(1,5,8,10);//take as many inputs
    }

    static void fun(int... v) //to take inputs unknonwn times
    {
        System.out.println(Arrays.toString(v));
    }

}
