public class Solution {
    public boolean wordPatternMatch(String pattern, String str) {
        if ((pattern == null || pattern.length() == 0) && (str == null || str.length() == 0)) {
            return true;
        }
         
        if ((pattern == null || pattern.length() == 0) || (str == null || str.length() == 0)) {
            return false;
        }
         
        Map<Character, String> forwardMap = new HashMap<>();
        Map<String, Character> invertedMap = new HashMap<>();
         
        return wordPatternMatchHelper(0, pattern, 0, str, forwardMap, invertedMap);
    }
    
    private boolean wordPatternMatchHelper(int pStart, String pattern, 
                                      int sStart, String str, 
                                      Map<Character, String> forwardMap, 
                                      Map<String, Character> invertedMap) {
        if (pStart == pattern.length() && sStart == str.length()) {
            return true;
        }
         
        if (pStart >= pattern.length() || sStart >= str.length()) {
            return false;
        }
         
        char pChar = pattern.charAt(pStart);
        for (int i = sStart; i < str.length(); i++) {
            String curr = str.substring(sStart, i + 1);
             
            if ((!forwardMap.containsKey(pChar)) && (!invertedMap.containsKey(curr))) {
                forwardMap.put(pChar, curr);
                invertedMap.put(curr, pChar);
                 
                if (wordPatternMatchHelper(pStart + 1, pattern, i + 1, 
                        str, forwardMap, invertedMap)) {
                    return true;
                }
                 
                forwardMap.remove(pChar);
                invertedMap.remove(curr);
            } else if (forwardMap.containsKey(pChar) && invertedMap.containsKey(curr)) {
                String dict = forwardMap.get(pChar);
                char pCharDict = invertedMap.get(curr);
                 
                // IMPORTANT !! If not equal, instead of returnning false immedidately,
                // We need to try other longer substrings. 
                if (!dict.equals(curr) || pCharDict != pChar) {
                    continue;
                }
                 
                if (wordPatternMatchHelper(pStart + 1, pattern, i + 1, str, 
                        forwardMap, invertedMap)) {
                    return true;
                }
            }
        }
         
        return false;
    }
}
