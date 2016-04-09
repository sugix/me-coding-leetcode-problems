public class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
	permute(nums, 0, result);
	return result;   
    }
    
    void permute(int[] num, int start, List<List<Integer>> result) {
 
	if (start >= num.length) {
		List<Integer> item = convertArrayToList(num);
		result.add(item);
	}
 
	for (int j = start; j <= num.length - 1; j++) {
		swap(num, start, j);
		permute(num, start + 1, result);
		swap(num, start, j);
	}
}
 
private List<Integer> convertArrayToList(int[] num) {
	List<Integer> item = new ArrayList<Integer>();
	for (int h = 0; h < num.length; h++) {
		item.add(num[h]);
	}
	return item;
}
 
private void swap(int[] a, int i, int j) {
	int temp = a[i];
	a[i] = a[j];
	a[j] = temp;
}
}
