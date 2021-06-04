public class App {
    public static void main(String[] args) throws Exception {
        //System.out.println(fib(7));
        System.out.println(fib(700));
    }

    public static long fib(long n) {
        
        long[] memo = new long[]{0,1};
        
        for(int i =0; i<n; i++) {
            long next = memo[0] + memo[1];
            memo[0] = memo[1];
            memo[1] = next;
        }
        return memo[0];
    }
}
