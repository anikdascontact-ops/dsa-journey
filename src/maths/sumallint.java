package maths;
import java.util.Scanner;

public class sumallint {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int result = 0;
        while (true) {
            System.out.println("Enter an integer or 0 complete:");
            int num = sc.nextInt();
            result = result + num;
            if (num == 0) {
                System.out.println("Total sum is "+result);
                break;
            }

        }
        sc.close();

    }
}
