package searching;

import java.util.Scanner;

public class linearsearch1inrange {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
        System.out.println("Enter starting index: ");
        int start = sc.nextInt();
        System.out.println("Enter ending index: ");
        int end = sc.nextInt();
        int[] num = { 11, 22, 33, 44, 55, 66, 77, 88, 99 };
        int target = 55;
        System.out.println("Target is at index= " + searchinrange(num, target, start, end));
        }
    }

    static int searchinrange(int[] arr, int target, int start, int end) {
        if (start < 0 || end >= arr.length || start > end) {
            return -1;
        }

        for (int i = start; i <= end; i++) {

            if (arr[i] == target) {
                return i;
            }
        }
        return -1;
    }
}
