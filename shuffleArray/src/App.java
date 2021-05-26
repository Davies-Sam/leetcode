import java.util.Arrays;
public class App {
    public static void main(String[] args) throws Exception {

        int[] numbers = {1,3,5,7,9,2,4,6,8,10};

        System.out.println(Arrays.toString(shuffle(numbers, 5)));
    }

    public static int[] shuffle(int[] nums, int n) {

        int[] arr = new int[nums.length];
        int i = 0, j=0;

        while(n<nums.length) {
            arr[j] = nums[i];
            j+=1;
            i+=1;
            arr[j] = nums[n];
            j+=1;
            n+=1;
        }
        return arr;

    }


}
