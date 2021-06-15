public class App {
    public static void main(String[] args) throws Exception {
        int[] test1 = new int[]{1,7,3,6,5,6};
        //System.out.println(pivotIndex(test1));
        assert pivotIndex(test1) == 3;
        int[] test2 = new int[]{1,2,3};
        //System.out.println(pivotIndex(test2));
        assert pivotIndex(test2) == -1;
        int[] test3 = new int[]{2,1,-1};
        //System.out.println(pivotIndex(test3));
        assert pivotIndex(test3) == 0;
    }

    public static int pivotIndex(int[] nums) {
        int total = 0;
        int leftSum = 0;
        for(int x : nums) {
            total+=x;
        }
        for(int i = 0; i < nums.length; i++){
            //right sum is equal to (total - leftsum) - current
            if(leftSum == total - leftSum - nums[i]) {
                return i;
            }
            leftSum += nums[i];
        }
        return -1;
    }
}
