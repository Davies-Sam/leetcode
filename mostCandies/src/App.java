import java.util.List;
import java.util.Collections;
import java.util.Arrays;
import java.util.ArrayList;

public class App {
    public static void main(String[] args) throws Exception {
        //System.out.println("Hello, World!");
        int[] candies = {2,4,6,2,6,5};
        List<Boolean> res = kidsWithCandies(candies, 1);

        System.out.println(res);

    }

    public static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {

        int max = Arrays.stream(candies).max().getAsInt();

        List<Boolean> res = new ArrayList<>();

        for(int n : candies){
            if (n + extraCandies >= max) 
            {
                res.add(true);
            }
            else {
                res.add(false);
            }
        }
        return res;
    }
}
