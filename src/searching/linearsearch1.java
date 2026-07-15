package searching;

//linear search in intergers
public class linearsearch1 {
    public static void main(String[] args) {
        int[] num = { 14, 62, 78, 32, 15, 22, 88, 91, 46, 75, 26, 34 };
        int target = 88;
        int result = LinearSearch(num, target);
        System.out.println(result);
    }

    static int LinearSearch(int[] arr, int target) {
        if (arr.length == 0) {
            return -1;
        }
        for (int index = 0; index < arr.length; index++) {
            int element = arr[index];
            if (element == target) {
                return index;
            }

        }
        return -1;

    }

}
