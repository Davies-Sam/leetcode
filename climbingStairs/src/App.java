public class App {
    public static void main(String[] args) throws Exception {
        //System.out.println("Hello, World!");
        System.out.println(climbingStairs(12));
    }

    public static int climbingStairs(int n) {
        /* use the basics to solve this question
        and find that it is the fibonacci problem.
        each stair number can be calculated using
        the number of distinct ways to reach 1 step
        below + # of ways for 2 steps below.
        if you are one or two steps away from your 
        target step, we already know from our base
        case the number of ways to go both 1 and 2 steps.
        */

        int[] memo = new int[]{1,2};
        int next = 0;
        int count = 1;
        while(count < n){
            next = memo[0]+memo[1];
            memo[0] = memo[1];
            memo[1] = next;
            count++;   
        }
        return memo[0];  
    }
}
