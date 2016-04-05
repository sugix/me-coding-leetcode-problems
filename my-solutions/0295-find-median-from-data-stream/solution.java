import java.util.*;

class MedianFinder {
    
    private PriorityQueue<Integer> leftPQ = 
        new PriorityQueue<>(Collections.reverseOrder());
    private PriorityQueue<Integer> rightPQ = new PriorityQueue<>();

    // Adds a number into the data structure.
    public void addNum(int num) {
        if (leftPQ.isEmpty() || num <= leftPQ.peek()) {
            leftPQ.offer(num);
        } else {
            rightPQ.offer(num);
        }
         
        // Rebalance the pqs
        if (leftPQ.size() - rightPQ.size() > 1) {
            rightPQ.offer(leftPQ.poll());
        } else if (rightPQ.size() - leftPQ.size() > 1) {
            leftPQ.offer(rightPQ.poll());
        }
    }

    // Returns the median of current data stream
    public double findMedian() {
        if (leftPQ.isEmpty() && rightPQ.isEmpty()) {
            throw new NoSuchElementException(); // if the queue is empty
        }
         
        if(leftPQ.isEmpty()) {
            return (double) rightPQ.peek();
        } else if (rightPQ.isEmpty()) {
            return (double) leftPQ.peek();
        } else if (leftPQ.size() > rightPQ.size()) {
            return (double) leftPQ.peek();
        } else if (rightPQ.size() > leftPQ.size()) {
            return (double) rightPQ.peek();
        } else {
            return (double) (leftPQ.peek() + rightPQ.peek()) / 2;
        }
    }
};

// Your MedianFinder object will be instantiated and called as such:
// MedianFinder mf = new MedianFinder();
// mf.addNum(1);
// mf.findMedian();
