class Solution:
    def highFive(self, items: List[List[int]]) -> List[List[int]]:
        min_heaps = collections.defaultdict(list)
        for i, val in items:
            heapq.heappush(min_heaps[i], val)
            if len(min_heaps[i]) > 5:
                heapq.heappop(min_heaps[i])
        return [[i, sum(min_heaps[i]) // len(min_heaps[i])] for i in sorted(min_heaps)]
