public class App {
    public static void main(String[] args) throws Exception {
        System.out.println(addBinary("1010101", "0101010"));
        System.out.println(addBinary("1010", "1"));
        System.out.println(addBinary("11", "1"));
        System.out.println(addBinary("1010", "1011"));
        
    }
    public static String addBinary(String a, String b) {
        
        int l1 = a.length();
        int l2 = b.length();
        StringBuilder res = new StringBuilder();
        StringBuilder s1 = new StringBuilder(a).reverse();
        StringBuilder s2 = new StringBuilder(b).reverse();
        int len = (l1 < l2) ? l2 : l1;
        Boolean carry = false;
        for(int i = 0; i < len; i++) {
            int val1 = (i < s1.length() ) ?Character.getNumericValue(s1.charAt(i) ): 0;
            int val2 = (i < s2.length() ) ?Character.getNumericValue(s2.charAt(i)) : 0;
            if(val1 + val2 == 2) {
                if(carry) {
                    res.append(1);
                }else{
                    res.append(0);
                    carry = true;
                }
            } else if (val1 + val2 == 1)
            {
                if(carry) {
                    res.append(0);
                }else{
                    res.append(1);
                }
            }else {
                if(carry){
                    res.append(1);
                    carry = false;
                }else{
                    res.append(0);
                }
            }
    
        }
        if(carry) res.append(1);
        //System.out.println(len);
        return res.reverse().toString();
        
    }
}
