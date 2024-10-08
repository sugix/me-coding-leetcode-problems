public class Solution {
    public int longestValidParentheses(String s) {
        Deque<int[]> stack = new LinkedList<>();
	int result = 0;
 
	for(int i=0; i<=s.length()-1; i++){
		char c = s.charAt(i);
		if(c=='('){
			int[] a = {i,0};
			stack.push(a);
		}else{
			if(stack.size() == 0 ||stack.peek()[1]==1){
				int[] a = {i,1};
				stack.push(a);
			}else{
				stack.pop();
				int currentLen=0;
				if(stack.size() == 0){
					currentLen = i+1;
				}else{
					currentLen = i-stack.peek()[0];
				}
				result = Math.max(result, currentLen);
			}
		}
	}
 
	return result;   
    }
}
