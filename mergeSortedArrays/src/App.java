import java.util.Arrays;

public class App {
    public static void main(String[] args) throws Exception {
        int[] nums1 = new int[]{2,6,9,0,0,0};
        int[] nums2 = new int[]{7,8,11};
        System.out.println(Arrays.toString(nums1));
        System.out.println(Arrays.toString(nums2));
        System.out.println("Calling Merge");
        merge(nums1, 3, nums2, 3);
        System.out.printf("nums1 is now %s", Arrays.toString(nums1));
    }

    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        //O(1) space
        //O(n+m) time
        int p1 = m - 1;
        int p2 = n - 1;

        for(int p=m+n - 1; p>=0; p--) {
            //if all nums2 are used, we are done merging.
            if(p2<0) break;
            if (p1 >=0 && nums1[p1] >= nums2[p2]) {
                //System.out.printf("putting %d\n", nums1[p1]);
                nums1[p] = nums1[p1--];
                
            //if all numbers in nums1 are already used:
            }else {
                //System.out.printf("putting %d\n", nums2[p2]);
                nums1[p] = nums2[p2--];
            }
        }
    }
}

