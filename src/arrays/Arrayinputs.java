package arrays;
import java.util.Scanner;
import java.util.Arrays;

public class Arrayinputs {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //int[] arr = new int[5];
        //for (int i = 0; i < arr.length; i++) {
        //arr[i] = sc.nextInt();
    
        String[] str = new String[5];
        for (int i = 0; i < str.length; i++) {
        str[i] = sc.nextLine();
    
    }
        System.out.println(Arrays.toString(str));
        sc.close();

    }
}