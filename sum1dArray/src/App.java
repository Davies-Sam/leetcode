import java.util.Arrays;

public class App {
    public static void main(String[] args) throws Exception {

        int[] nums = new int[]{1,2,3,4,5,6,7,8,9};
        int[] x = runningSum(nums);
        System.out.println(Arrays.toString(x));
    }

    public static int[] runningSum(int[] nums) {

        for (int i = 1; i < nums.length; i++) {
            nums[i]+=nums[i-1];
        }
        return nums;
    }
}
