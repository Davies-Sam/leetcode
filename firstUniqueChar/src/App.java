public class App {
    public static void main(String[] args) throws Exception {
        System.out.println(firstUniqChar("abcdefghijabcdefhij"));
        System.out.println(firstUniqChar("askng;lnahw3othr;dflkj;adsa;fklhyklh"));
    }

    public static int firstUniqChar(String s) { 
        for(char c: s.toCharArray()){
            if (s.indexOf(c) == s.lastIndexOf(c)) return s.indexOf(c);
        }
        return -1;
    }
}
