public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
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
