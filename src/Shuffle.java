import java.util.Arrays;



public class Shuffle {
    public static void main(String[] args) {
        int[] testArray = {1,2,3,4,4,3,2,1};
        int[] resultArray = {1, 4, 1, 5, 2, 6, 3, 7};
        System.out.println(Arrays.toString(shuffle(testArray, 4)));
    }

    public static int[] shuffle(int[] nums, int n) {
        int[] array = new int[2 * n];
        int count = 0;
        for (int i = 0; i < n; i+=1) {
                array[count] = nums[i];
                count++;
                array[count] = nums[n + i];
                count++;
            }
        return array;
    }
}

