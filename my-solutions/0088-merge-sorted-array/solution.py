class Solution:
    def merge(self, nums1: List[int], m: int, nums2: List[int], n: int) -> None:
        p1 = m - 1
        p2 = n - 1
        p = m + n - 1
        
        # Merge elements from the end of nums1 and nums2
        while p1 >= 0 and p2 >= 0:
            if nums1[p1] > nums2[p2]:
                nums1[p] = nums1[p1]
                p1 -= 1
            else:
                nums1[p] = nums2[p2]
                p2 -= 1
            p -= 1

        if nums1 or nums2:
        
            # Copy remaining elements from nums2 to nums1 if any
            nums1[:p2 + 1] = nums2[:p2 + 1]
