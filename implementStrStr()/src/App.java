public class App {
    public static void main(String[] args) throws Exception {
        //System.out.println("Hello, World!");
        String haystack = "this is how we do things";
        String needle = "how";
        System.out.println(strStr(haystack, needle));
        haystack = "aabbacabbacccbacbacba";
        needle = "abbacc";
        System.out.println(strStr(haystack, needle));
    }

    public static int strStr(String haystack, String needle) {
        /* I solved this problem by use of indexOf,
        for each occurence of the needle's first char
        that appears in haystack, start at the index of
        that occurence, and check that the next char in
        haystack matches the next char of needle.
        If they don't match, then start checking again
        at the next occurence of needle's first char in haystack.
        */
        if(needle.length() == 0) return 0; 
        char begin = needle.charAt(0);
        char[] hayArr = haystack.toCharArray();
        char[] needleArr = needle.toCharArray();
        int index = haystack.indexOf(begin);
        // index will be -1 if needle's first char never appears in haystack
        while(index>=0) {
            int nIndex = 0;
            for(int i = index; i<hayArr.length; i++) {
                if(hayArr[i] != needleArr[nIndex]) break;
                nIndex++;
                if(nIndex == needleArr.length) return index;
            }
            index = haystack.indexOf(begin, index+1);
        }
        return index;
    }
     
}
