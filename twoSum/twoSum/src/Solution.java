import java.util.HashMap;
import java.util.Map;
import java.util.Arrays;

public class Solution {
    public static int[] twoSum(int[] nums, int target) {
        
        Map<Integer,Integer> complement = new HashMap<Integer,Integer>();
        
        for(int i = 0; i < nums.length; i++) {
            int n = nums[i];
            
            if (complement.containsKey(n)) {
                int[] res = new int[]{complement.get(n), i};
                return res;
            }
            else {
                complement.put(target - n, i);
            }
            
        }
        // assumption : nums has exactly one solution
        // so, no need for return here.
        return nums;
    }

    public static void main(String[] args) throws Exception {
        
        int[] res = new int[2];
        int[] test = new int[]{2,7,11,15};
        res = twoSum(test, 9);
        System.out.println(Arrays.toString(res));
    }
}