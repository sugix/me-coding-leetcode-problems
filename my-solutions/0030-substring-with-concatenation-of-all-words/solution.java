public class Solution {
    public List<Integer> findSubstring(String s, String[] words) {
        List<Integer> result = new ArrayList<>();
    if(s==null||s.length()==0||words==null||words.length==0){
        return result;
    } 
 
    //frequency of words
    Map<String, Integer> map = new HashMap<>();
    for(String w: words){
        if(map.containsKey(w)){
            map.put(w, map.get(w)+1);
        }else{
            map.put(w, 1);
        }
    }
 
    int len = words[0].length();
 
    for(int j=0; j<len; j++){
        Map<String, Integer> currentMap = new HashMap<>();
        int start = j;//start index of start
        int count = 0;//count totoal qualified words so far
 
        for(int i=j; i<=s.length()-len; i=i+len){
            String sub = s.substring(i, i+len);
            if(map.containsKey(sub)){
                //set frequency in current map
                if(currentMap.containsKey(sub)){
                    currentMap.put(sub, currentMap.get(sub)+1);
                }else{
                    currentMap.put(sub, 1);
                }
 
                count++;
 
                while(currentMap.get(sub)>map.get(sub)){
                    String left = s.substring(start, start+len);
                    currentMap.put(left, currentMap.get(left)-1);
 
                    count--;
                    start = start + len;
                }
 
 
                if(count==words.length){
                    result.add(start); //add to result
 
                    //shift right and reset currentMap, count & start point         
                    String left = s.substring(start, start+len);
                    currentMap.put(left, currentMap.get(left)-1);
                    count--;
                    start = start + len;
                }
            }else{
                currentMap.clear();
                start = i+len;
                count = 0;
            }
        }
    }
 
    return result;
    }
}
