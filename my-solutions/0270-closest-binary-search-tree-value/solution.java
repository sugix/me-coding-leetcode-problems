/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Solution {
    private double min = Double.MAX_VALUE;
    private int ans = 0;
    
    public int closestValue(TreeNode root, double target) {
        if (root == null) {
            return Integer.MAX_VALUE;
        }
         
        closestValueHelper(root, target);
         
        return ans;    
    }
    
    private void closestValueHelper(TreeNode root, double target) {
        if (root == null) {
            return;
        }
         
        if (Math.abs((double) root.val - target) < min) {
            min = Math.abs((double) root.val - target);
            ans = root.val;
        }
         
        if (root.val > target) {
            closestValueHelper(root.left, target);
        } else if (root.val < target) {
            closestValueHelper(root.right, target);
        }
    }
}
