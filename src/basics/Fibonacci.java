package basics;

import java.util.Scanner;

public class Fibonacci {

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter number of terms :");
            int term = sc.nextInt();
            int a = 0, b = 1;
            for (int i = 1; i <= term; i++) {
                System.out.print(a + " ");
                int temp = a + b;
                a = b;
                b = temp;

            }
        }
    }
}
