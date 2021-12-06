import java.util.Arrays;

public class countSmaller {
    public static void main(String[] args) {
        int [] testArray = {8,1,2,2,3};
        System.out.println(Arrays.toString(smallerNumbersThanCurrent(testArray)));
    }
    public static int[] smallerNumbersThanCurrent(int[] nums) {
        int [] smallerArray = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            int countSmaller = 0;
            for (int j = 0; j < nums.length; j++) {
                if (nums[j] < nums[i]) {
                    countSmaller++;
                    }
                }
            smallerArray[i] = countSmaller;
            }
        return smallerArray;
    }
}
