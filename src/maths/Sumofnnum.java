package maths;
import java.util.Scanner;

public class Sumofnnum {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter ending of natural number:");
            int num = sc.nextInt();
            int result = sum(num);
            System.out.println("Sumof natural num till " + num + " is " + result);
        }
    }

    static int sum(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum = sum + i;
        }
        
        return sum;
    }
    


}

/*
 * import java.util.Scanner;

public class Sumofnnum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter ending of natural number:");
        int num = sc.nextInt();
        sum(num);
        sc.close();
    }

    static void sum(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum = sum + i;
        }
        
        System.out.println(sum);
    }

}

 */