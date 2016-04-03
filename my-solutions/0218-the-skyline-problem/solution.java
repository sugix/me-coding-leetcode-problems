public class Solution {
    public List<int[]> getSkyline(int[][] buildings) {
            List<int[]> result = new ArrayList<int[]>();
        if (buildings == null) {
            return result;
        }
        
        List<HeightLine> heights = new ArrayList<HeightLine>();
        for (int[] building : buildings) {
            HeightLine lh = new HeightLine(building[0], -building[2]); // left height line
            HeightLine rh = new HeightLine(building[1], building[2]); // right heightline
            heights.add(lh);
            heights.add(rh);
        }
        
        Collections.sort(heights, new Comparator<HeightLine>(){ // sort ascendingly
            @Override
            public int compare(HeightLine h1, HeightLine h2) {
                return h1.index != h2.index ? h1.index - h2.index : h1.height - h2.height;
            }
        });
        
        PriorityQueue<Integer> pq = new PriorityQueue<Integer>(1000, Collections.reverseOrder());
        pq.offer(0);
        int preMax = 0;
        for (HeightLine h : heights) {
            if (h.height < 0) { // left height line
                pq.offer(-h.height);                
            } else {
                pq.remove(h.height);
            }
            int curMax = pq.peek();
            if (curMax != preMax) {
                result.add(new int[]{h.index, curMax});
                preMax = curMax;
            }
        }
        
        return result;
    }
    
    class HeightLine {
        int height; //negative if it is the left height line; positive if it is the right height line
        int index;
        public HeightLine(int index, int height) {
            this.index = index;
            this.height = height;
        }
    }
}
