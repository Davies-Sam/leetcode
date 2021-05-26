public class App {
    public static void main(String[] args) throws Exception {
        System.out.println(addStrings("123", "244"));
    }

    public static String addStrings(String num1, String num2) {
        
        StringBuilder res = new StringBuilder();
        
        int carry = 0;
        int p1 = num1.length() - 1;
        int p2 = num2.length() - 1;
        
        while (p1 >= 0 || p2 >= 0) {
            
            int x1 = p1 >= 0 ? num1.charAt(p1) - '0' : 0;
            int x2 = p2 >= 0 ? num2.charAt(p2) - '0' : 0;
            
            int value = (x1 + x2 + carry) % 10;
            //System.out.println(value);
            carry = (x1 + x2 + carry) / 10;
            //System.out.println(carry);
            res.append(value);
            p1--;
            p2--;    
        }
        
        if (carry != 0)
            res.append(carry);
        
        return res.reverse().toString();
        
    }
}
