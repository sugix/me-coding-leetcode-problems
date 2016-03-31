public class Solution {
    public boolean isScramble(String s1, String s2) {
        //Check lengths.
        if (s1.length() != s2.length())
            return false;
        if (s1.equals(s2))
            return true;
            
        int L = s1.length();
        //Check characters.
        int[] chars = new int[26];
        for (int i = 0; i < L; i++) {
            chars[s1.charAt(i) - 'a']++;
            chars[s2.charAt(i) - 'a']--;
        }
            
        for (int i = 0; i < 26; i++) {
            if (chars[i] != 0)
                return false;
        }
 
        //More letters
        for (int i = 1; i < L; i++) {
            String s11 = s1.substring(0, i);
            String s12 = s1.substring(i, L);
            String s21 = s2.substring(0, i);
            String s22 = s2.substring(i, L);
            if (isScramble(s11, s21) && isScramble(s12, s22))
                return true;
            s21 = s2.substring(0, L - i);
            s22 = s2.substring(L - i, L);
            if (isScramble(s11, s22) && isScramble(s12, s21))
                return true;
        }
        return false;
    }
}
