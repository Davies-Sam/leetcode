import java.util.HashSet;
public class App {
    public static void main(String[] args) throws Exception {
        int[] nums = new int[] {1,2,2,3,3,3,4,4,4,4,5,5,5,5,5,6,6,6,6,6,6};
        int newLength = removeDuplicates(nums);
        for(int i = 0; i < newLength; i++) {
            System.out.print(nums[i]);
        }
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
