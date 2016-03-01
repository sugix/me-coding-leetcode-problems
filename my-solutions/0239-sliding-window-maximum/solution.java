public class Solution {
    private Deque<Integer> deque = new LinkedList<>();

    public int[] maxSlidingWindow(int[] nums, int k) {
        int inputLength = nums.length;
        List<Integer> results = new ArrayList<>();
        int count = 0;

        if (nums.length <= k && nums.length > 0) {
            int max = nums[count];
            for (; count < nums.length; count++) {
                if(nums[count] > max)
                    max = nums[count];
            }
            int[] result = new int[1];
            result[0] = max;
            return result;
        }
        if(nums.length == 0){
            int[] result = {};
            return result;
        }



        //Process elements of subarray of size k
        for (; count < k; count++) {
            while (!deque.isEmpty() && nums[count] > nums[deque.peekLast()])
                deque.pollLast();
            deque.addLast(count);
        }

        //Process rest of the element
        for (; count < inputLength; count++) {
            results.add(nums[deque.peekFirst()]);

            // Remove elements from the old window
            while (!deque.isEmpty() && deque.peekFirst() <= count - k)
                deque.pollFirst();

            // Process the remaining windows
            while (!deque.isEmpty() && nums[count] > nums[deque.peekLast()])
                deque.pollLast();
            deque.addLast(count);
        }

        // Add the last element to results
        if (!deque.isEmpty())
            results.add(nums[deque.pollFirst()]);

        int[] resultsToBeSent = new int[results.size()];

        for (int i = 0; i < results.size(); i++)
            resultsToBeSent[i] = results.get(i);
        return resultsToBeSent;
    }
}
