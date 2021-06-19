public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
    }

    public static int removeDuplicates(int[] nums) {
        
        HashSet<Integer> seen = new HashSet<Integer>();
        int insertionIndex = 0;
        for(int num : nums) {
            if(!seen.contains(num)){
                seen.add(num);
                nums[insertionIndex] = num;
                insertionIndex ++;
            }
        }
        
        return insertionIndex;
    }
}
