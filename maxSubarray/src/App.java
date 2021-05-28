public class App {
    public static void main(String[] args) throws Exception {
        int[] numbers = new int[]{-2,1,-3,4,-1,2,1,-5,4};
        System.out.println(maxSubArray(numbers));
    }


    // kadane's algorithm
    // keep track of our running total
    // if our current subarray gives a negative
    // total, drop it and start the subarray at
    // the next element.
    public static int maxSubArray(int[] nums) {
        
        int cur = nums[0];
        int max = cur;
        
        for(int i=1; i<nums.length;i++) {
            
            if (cur < 0){
                cur = nums[i];
            }else {
                cur +=nums[i];
            }
            if(cur > max) max = cur;
            
        }
        return max;
    }
}
