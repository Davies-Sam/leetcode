public class App {
    public static void main(String[] args) throws Exception {
        int[][] accounts = {{1,2,3}, {3,2,1}};
        System.out.println(maximumWealth(accounts));
    }


    public static int maximumWealth(int[][] accounts) {

        int max = 0;
        for(int i= 0; i<accounts.length; i++) {
            int customer = 0;
            for (int j=0; j<accounts[0].length; j++){
                customer += accounts[i][j];
            }
            if (customer > max) max = customer;
        }
        
        return max;
    }
    
}
