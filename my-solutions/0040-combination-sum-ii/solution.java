public class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> result = new ArrayList<>();
    if(candidates == null || candidates.length == 0)
        return result;
 
    Arrays.sort(candidates);            
 
    List<Integer> temp = new ArrayList<>();    
    getCombination(candidates, 0, target, temp, result);
 
    Set<List<Integer>> set = new HashSet<>(result);
 
    //remove duplicate lists
    result.clear();
    result.addAll(set);
 
    return result;
    }
    
    public void getCombination(int[] num, int start, int target, List<Integer> temp, List<List<Integer>> result){
    if(target == 0){
        List<Integer> t = new ArrayList<>(temp);
        result.add(t);
        return;
    }
 
    for(int i=start; i<num.length; i++){
        if(target < num[i])
            continue;
 
        temp.add(num[i]);
        getCombination(num, i+1, target-num[i], temp, result);
        temp.remove(temp.size()-1);
    }
}
}
