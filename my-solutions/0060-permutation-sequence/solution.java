public class Solution {
    
    /**To calculate the first digit, we can calculate it by k % (n – 1)! = 4 / 2! = 2, which is the position of 3 in array [1,2,3]. Now we need to delete 3 from the array, so the array becomes [1, 2]. And k should become 4 % 2! = 0. Now we calculate k / (n – 2)! = 0 / 1 = 0, which is the position of 1 in array [1, 2]. So the second digit should be 1. We need to delete 1 from the array. And there is only one entry left in the array. So the final digit should be 2. Finally we get the permutation: 312**/
    public String getPermutation(int n, int k) {
        boolean[] output = new boolean[n];
		StringBuilder buf = new StringBuilder("");
 
		int[] res = new int[n];
		res[0] = 1;
 
		for (int i = 1; i < n; i++)
			res[i] = res[i - 1] * i;
 
		for (int i = n - 1; i >= 0; i--) {
			int s = 1;
 
			while (k > res[i]) {
				s++;
				k = k - res[i];
			}
 
			for (int j = 0; j < n; j++) {
				if (j + 1 <= s && output[j]) {
					s++;
				}
			}
 
			output[s - 1] = true;
			buf.append(Integer.toString(s));
		}
 
		return buf.toString();
    }
}
