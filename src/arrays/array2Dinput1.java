package arrays;

import java.util.Scanner;
import java.util.Arrays;

public class array2Dinput1 {
    public static void main(String[] args) {
        int[][] arr = new int[3][3];
        //arr[0]=new int[5];//to add arrays of different col length
        //arr[0]=new int[3];
        Scanner sc = new Scanner(System.in);
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                arr[row][col] = sc.nextInt();

            }
        }
        for (int row = 0; row < arr.length; row++) {
                System.out.println(Arrays.toString(arr[row]));

            }

        /*for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                System.out.print(arr[row][col] + " ");

            }
            System.out.println();
        }*/
       //another way to print output
        sc.close();
    }

}
