package maths;
import java.util.Scanner;

public class areacircle {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter radius of circle :");
            float r = sc.nextFloat();
            double area = Math.PI * r * r;
            System.out.println("Area of the circle is " + area);
            sc.close();
        }

    }
}
