package basics;
import java.util.Scanner;

public class loweroruppercase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        char ch = sc.next().trim().charAt(0);
        if (ch >= 'a' && ch <= 'z') //ascii value 
        {
            System.out.println("lowercase");
        } else {
            System.out.println("UPPERCASE");
        }
        sc.close();

    }
}
