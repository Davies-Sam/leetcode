import java.util.HashMap;
import java.util.Map;
public class App {
    public static void main(String[] args) throws Exception {
        int[] x = {1,2,3,4,5,6,7,1,1,1};
        System.out.println(numIdenticalPairs(x));
    }

    public static int numIdenticalPairs(int[] nums) {

        Map<Integer,Integer> m = new HashMap<Integer,Integer>();

        int result = 0;

        for(int n: nums) {
            if (m.containsKey(n)) {
                int val = m.get(n);
                result += val;
                m.put(n,val+1);
            }
            else {
                m.put(n,1);
            }
        }
        return result;
    }
}
