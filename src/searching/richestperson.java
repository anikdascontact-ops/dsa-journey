package searching;

public class richestperson {

    public static void main(String[] args) {

        int[][] num = {
            {1, 5, 3},
            {5, 1, 6},
            {4, 9}

        };
        richest(num);
    }

    static void richest(int[][] arr) {
        int sum1 = 0;
        int sum2 = 0;
        int sum3 = 0;
        for (int col = 0; col < arr[0].length; col++) {
            sum1 = sum1 + arr[0][col];

        }
        for (int col = 0; col < arr[1].length; col++) {
            sum2 = sum2 + arr[1][col];

        }
        for (int col = 0; col < arr[2].length; col++) {
            sum3 = sum3 + arr[2][col];

        }
        System.out.println("sum1: " + sum1);
        System.out.println("sum2: " + sum2);
        System.out.println("sum3: " + sum3);
        int rich= sum1;
        if(rich<sum2){
            rich=sum2;
            
        }
        else if(rich<sum3){
            rich=sum3;
        }
        else{
            rich=sum1;
        }
        System.out.println("Richest persons wealth="+rich);
    }

}
