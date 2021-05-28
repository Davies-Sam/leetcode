package src;
import java.util.Map;
import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class App {
    public static void main(String[] args) throws Exception {
        String[] strings = new String[]{"flower","flow","flight"};
        System.out.println(longestCommonPrefix(strings));
    }

    public static String longestCommonPrefix(String[] strs) {
        //a naive solution
        if (strs.length == 1) return strs[0];
        Map<String, Integer> m = new HashMap<String,Integer>();
        
        for(String s: strs) {
            if (s=="") continue;
            for(int i=0; i<s.length();i++){

                String subStr = s.substring(0,i+1);

                //System.out.println(subStr);
                if(m.get(subStr) != null) {
                    m.put(subStr, m.get(subStr) + 1);
                }
                else {
                    m.put(subStr, 1);
                }
                  
                
            }
        }
        
        if(m.isEmpty()) return "";
        int max = Collections.max(m.values());
        // If our prefix count is less than 
        // the number of words, that means
        // atleast one word does not share
        // a prefix with the rest. - return ""
        if(max < strs.length) return "";
        //System.out.println(m.entrySet());
        
        List<String> possible  = new ArrayList<String>();
        for (Map.Entry<String, Integer> entry : m.entrySet()){
            if (entry.getValue()==max) {
                possible.add(entry.getKey());
            }
        }

        int l = 0;
        String res = new String();
        for (String s : possible) {
            if(s.length() > l){
                res = s;
                l = s.length();
            }
        }
        return res;
      
    }
}
