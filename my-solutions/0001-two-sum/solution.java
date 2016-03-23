import java.util.Arrays;
import java.util.Map;

public class Solution {
        public int[] twoSum(int[] nums, int target) {
            if (nums.length == 0 || nums.length < 2)
            return new int[]{0, 0};
            
            Map<Integer,Integer> numberPosition = new HashMap<>();
            
            for(int count=0; count < nums.length; count++){
                int difference = target - nums[count];
                
                if(numberPosition.containsKey(nums[count])){
                    
                    return new int[]{numberPosition.get(nums[count]),count};
                }else{
                    numberPosition.put(difference,count);
                }
            }

        return new int[]{0, 0};
        }
    }
