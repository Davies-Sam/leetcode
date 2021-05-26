public class App {
    public static void main(String[] args) throws Exception {

        int[] prices = {7,1000,2,3,6,4};

        System.out.println(maxProfit(prices));
        
    }


    public static int maxProfit(int[] prices) {

        int buy = prices[0];
        int profit = 0;

        for (int n : prices) {
            int cur = n;
            if (cur < buy) {
                buy = cur;
                continue;
            }
            int potential = cur - buy;
            if (potential > profit) {
                profit = potential;
            }
        }
        return profit;
    }
}
