public class Solution {
    
    public String shortestPalindrome(String s) {
        // preprocessing  
     if(s == null || s.length()==0) return s;  
     s = preProcess(s);  
       
     // get longest palindrome substring  
     int[] range = new int[s.length()];  
     int pivot = 0;  
     range[0] = 1;  
     for(int i = 1;i < s.length();i++){  
       if(range[pivot]+pivot > i){  
         if(range[pivot] + pivot > range[2*pivot-i] + i)  
           range[i] = range[2*pivot-i];  
         else  
           range[i] = range[pivot]+pivot-i;  
       }  
         
       while(range[i]+i < s.length() && i-range[i] >= 0 && s.charAt(i+range[i])==s.charAt(i-range[i])) range[i]++;  
   
       if(range[pivot]+pivot < range[i]+i) pivot = i;  
     }  
       
     // extend based on the longest palindrome substring  
     while(pivot-(range[pivot]-1)!=0) pivot--;  
     s = reverse(s.substring(pivot+range[pivot], s.length())) + s;  
       
     // postprocessing  
     return postProcess(s);   
    }
    
    private String reverse(String s){  
     return new StringBuilder(s).reverse().toString();  
   }  
     
   private String postProcess(String s){  
     StringBuilder rslt = new StringBuilder();  
     for(int i = 0;i < s.length();i++)  
       if(s.charAt(i)!='#') rslt.append(s.charAt(i));  
     return rslt.toString();  
   }  
     
   private String preProcess(String s){  
     StringBuilder rslt = new StringBuilder();  
     for(int i = 0;i < s.length();i++){  
       if(i==0) rslt.append("#");  
       rslt.append(s.charAt(i));  
       rslt.append("#");  
     }  
     return rslt.toString();  
   }
}
