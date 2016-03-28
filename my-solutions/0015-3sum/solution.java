import java.util.*;

public class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new LinkedList<>();
        if(nums.length < 3)
            return result;
            
        Arrays.sort(nums);
        
        HashSet<List<Integer>> set = new HashSet<>();
        for (int i = 0; i < nums.length - 2; i++) {
            int start = i + 1;
            int end = nums.length - 1;
            while (start < end) {
                if (nums[i] + nums[start] + nums[end] == 0) {
                    LinkedList<Integer> oneResult = new LinkedList<>();
                    oneResult.add(nums[i]);
                    oneResult.add(nums[start]);
                    oneResult.add(nums[end]);
                    set.add(oneResult);
                    start++;
                    end--;
                } else {
                    if (nums[i] + nums[start] + nums[end] < 0)
                        start++;
                    else
                        end--;
                }
            }
        }
        result.addAll(set);
        return result;
    }
}
