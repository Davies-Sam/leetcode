import java.util.HashMap;
import java.util.Map;

public class App {
    public static void main(String[] args) throws Exception {
        int x = romanToInt("XXVII");
        System.out.println(x);
        int y = romanToInt("MCMXCIV");
        System.out.println(y);
        int z = romanToInt("LVIII");
        System.out.println(z);


    }
    public static int romanToInt(String s) {

        Map<Character, Integer> m = Map.of('I', 1, 'V', 5, 'X', 10, 'L', 50, 'C', 100, 'D', 500, 'M', 1000);
        int res = 0;

        char[] chars = s.toCharArray();
        boolean done = false;
        for(int i = 0; i < chars.length-1; i++) {
            if (chars[i] == 'I' && (chars[i + 1] == 'V' || chars[i+1] == 'X')) {
                if (chars[i+1] == 'V') {
                    res+=4;
                }
                else{
                    res+=9;
                }
                if (i == chars.length - 2){
                    done = true;
                    break;
                }
                i+=1;

            }else if (chars[i] == 'X' && (chars[i + 1] == 'L' || chars[i+1] == 'C')) {
                if (chars[i+1] == 'L') {
                    res+=40;
                }
                else{
                    res+=90;
                }
                if (i == chars.length - 2){
                    done = true;
                    break;
                }
                i+=1;

            }else if (chars[i] == 'C' && (chars[i + 1] == 'D' || chars[i+1] == 'M')) {
                if (chars[i+1] == 'D') {
                    res+=400;
                }
                else{
                    res+=900;
                }
                if (i == chars.length - 2){
                    done = true;
                    break;
                }
                i+=1;

            }else {
                res+= m.get(chars[i]);
            }
            
        }
        if (!done){
                res+=m.get(chars[chars.length -1]);
            }
        return res;
    }

    
}
