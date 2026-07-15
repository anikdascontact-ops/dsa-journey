package basics;
import java.util.Scanner;

public class nestedswitchcase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int empID = sc.nextInt();
        String dept = sc.next();

        switch (empID) {
            case 1:
                System.out.println("Anik");
                break;
            case 2:
                System.out.println("Anshu");
                break;
            case 3:
                System.out.println("Akshay");
                switch (dept) {
                    case "IT":
                        System.out.println("IT dept");
                        break;
                    case "CSE":
                        System.out.println("CSE dept");
                        break;
                    default:
                        System.out.println("no dept entered");

                }
                break;
            default:
                System.out.println("Enter valid empID");
        }

        sc.close();

    }
}
