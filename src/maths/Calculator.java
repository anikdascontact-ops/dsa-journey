package maths;
import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {

        try (Scanner sc = new Scanner(System.in)) {

            double ans = 0;

            while (true) {
                System.out.print("Enter an operator (+, -, *, /, %, x to exit): ");
                char op = sc.next().trim().charAt(0);

                if (op == 'x' || op == 'X') {
                    System.out.println("Exiting calculator...");
                    break;
                }

                if (op == '+' || op == '-' || op == '*' || op == '/' || op == '%') {

                    System.out.print("Enter 1st num: ");
                    if (!sc.hasNextDouble()) {
                        System.out.println("Invalid input!");
                        sc.next();
                        continue;
                    }
                    double num1 = sc.nextDouble();

                    System.out.print("Enter 2nd num: ");
                    if (!sc.hasNextDouble()) {
                        System.out.println("Invalid input!");
                        sc.next();
                        continue;
                    }
                    double num2 = sc.nextDouble();

                    switch (op) {
                        case '+' -> ans = num1 + num2;
                        case '-' -> ans = num1 - num2;
                        case '*' -> ans = num1 * num2;
                        case '%' -> ans = num1 % num2;
                        case '/' -> {
                            if (num2 != 0) {
                                ans = num1 / num2;
                            } else {
                                System.out.println("Error: Cannot divide by 0!");
                                continue;
                            }
                        }
                    }

                    System.out.println("Result = " + ans);

                } else {
                    System.out.println("Invalid operator! Try again.");
                }
            }
        }
    }
}