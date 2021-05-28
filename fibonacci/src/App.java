public class App {
    public static void main(String[] args) throws Exception {
        System.out.println(fib(7));
    }

    public static int fib(int n) {
        
        int[] memo = new int[]{0,1};
        
        for(int i =0; i<n; i++) {
            int next = memo[0] + memo[1];
            memo[0] = memo[1];
            memo[1] = next;
        }
        return memo[0];
    }
}
