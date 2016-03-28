public class Solution {
    public int threeSumClosest(int[] nums, int target) {
        int result = 0;
        int minDiffSoFar = Integer.MAX_VALUE;
        
        if(nums.length < 3) 
            return result;
            
        // Sort the array
        Arrays.sort(nums);
        
        for(int i=0;i<nums.length;i++){
            int startPointer = i+1;
            int endPointer = nums.length-1;
            
            while(startPointer < endPointer){
                int sum = nums[startPointer] + nums[endPointer] + nums[i];
                int difference = Math.abs(target - sum);
                
                if(difference == 0)
                    return sum;
                    
                if(difference < minDiffSoFar){
                    minDiffSoFar = difference;
                    result = sum;
                }     
                
                if(sum <= target)
                    startPointer++;
                else
                   endPointer--; 
            }
            
        }
        
        return result;    
    }
}
