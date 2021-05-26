import java.util.Set;
import java.util.HashSet;

public class App {
    public static void main(String[] args) throws Exception {
        String Jewels = "aBb";
        String Stones = "adfsAbDBdelkB";

        System.out.println(numJewelsInStones(Jewels, Stones));
    }

    public static int numJewelsInStones(String Jewels, String Stones) {

        int result = 0;

        Set<Character> s = new HashSet<Character>();
        for(char c: Jewels.toCharArray()) {
            s.add(c);
        }
        for(char c: Stones.toCharArray()) {
            if(s.contains(c)) result+=1;
        }
        return result;
    }
}
