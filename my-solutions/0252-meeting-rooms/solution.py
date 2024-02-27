class Solution:
    def canAttendMeetings(self, intervals: List[List[int]]) -> bool:

        # Sort the intervals by start time
        intervals.sort(key = lambda x: x[0])

        for i in range(1, len(intervals)):
            if intervals[i][0] < intervals[i-1][1]:
                return False
        return True
        
