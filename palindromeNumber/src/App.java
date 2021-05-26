public class App {

    public static void main(String[] args) throws Exception {
        System.out.println(isPalindrome(1331));

    }

    public static boolean isPalindrome(int x) {

        StringBuilder s = new StringBuilder(String.valueOf(x));
        StringBuilder r = new StringBuilder(String.valueOf(x)).reverse();

        if(!s.toString().equals(r.toString())) {
            return false;
        }
        return true;
    

    }

 

}
