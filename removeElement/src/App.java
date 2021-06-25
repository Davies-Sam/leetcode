public class App {
    public static void main(String[] args) throws Exception {
        int[] nums = new int[] {1,2,2,3,3,3,4,4,4,4,5,5,5,5,5};
        int newLength = removeElement(nums, 3);
        for(int i = 0 ; i < newLength ; i++){
            System.out.print(nums[i]);
        }
    }

    public static int removeElement(int[] nums, int val) {
        
        int insertionIndex = 0;
        for(int num : nums) {
            if(num != val) {
                nums[insertionIndex] = num;
                insertionIndex++;
            }
        }
        return insertionIndex;
    }
}
