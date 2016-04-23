public class Solution {
    public String reverseString(String s) {
        if(s == null)
            return null;
            
        char[] sa = s.toCharArray();
        
        for(int i = 0, j = sa.length - 1; i < sa.length / 2; i++, j--) {
            char c = sa[i];
            sa[i] = sa[j];
            sa[j] = c;
        }
        
        return new String(sa);
    }
}
