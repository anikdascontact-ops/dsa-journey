package maths;
import java.util.Scanner;

public class ocurrence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number :");
        int a = sc.nextInt();
        System.out.print("Find :");
        int find = sc.nextInt();
        int count = 0;
        while (a > 0) {
            int rem = a % 10;
            a = a / 10;
            if (rem == find) {
                count++;
            }

        }
        System.out.println(find + " has ocurred " + count + " times.");
        sc.close();
    }
}
