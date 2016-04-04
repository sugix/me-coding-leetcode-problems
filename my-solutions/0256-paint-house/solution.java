public class Solution {
    public int minCost(int[][] costs) {
        if (costs == null || costs.length == 0) {
            return 0;
        }
         
        int n = costs.length;
        int[] prev = new int[3];
        int[] curr = new int[3];
         
        prev[0] = costs[0][0];
        prev[1] = costs[0][1];
        prev[2] = costs[0][2];
         
        for (int i = 1; i < n; i++) {
            curr[0] = Math.min(prev[1], prev[2]) + costs[i][0];
            curr[1] = Math.min(prev[0], prev[2]) + costs[i][1];
            curr[2] = Math.min(prev[0], prev[1]) + costs[i][2];
             
            // update the curr
            prev[0] = curr[0];
            prev[1] = curr[1];
            prev[2] = curr[2];
        }
         
        return Math.min(Math.min(prev[0], prev[1]), prev[2]);
    }
}
