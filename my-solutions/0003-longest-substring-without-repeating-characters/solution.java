import java.lang.*;

public class Solution {
    public int lengthOfLongestSubstring(String s) {
        if(s == null)
            return 0;
        
        // Ascii based character presence lookup    
        boolean[] charLookup = new boolean[256];
        
        // Two variables to hold the final result and also the start position based on which we update the result periodically
        int result = 0;
        int startPosition = 0;
        
        char[] inputCharacters = s.toCharArray();
        
        for(int i=0;i< inputCharacters.length; i++){
            if(charLookup[inputCharacters[i]]){
                // When character is already present then it is time for us to calculate the current result before we reset
                // the start position again. Result is afterall a variable holding value based on the start position. 
                
                // Update the result
                result = Math.max(result,i-startPosition);
                for(int j = startPosition; j < i; j++){
                    if(inputCharacters[j] == inputCharacters[i]){
                        startPosition = j + 1;
                        break;
                    }
                    charLookup[inputCharacters[j]] = false;
                }
            }else
                charLookup[inputCharacters[i]]=true;
        }
        
        // Time to calculate the result for last time before returning
        result = Math.max(result,inputCharacters.length - startPosition);
        return result;
    }
}
