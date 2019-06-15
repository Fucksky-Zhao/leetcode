class Solution:
    def findKthLargest(self, nums: List[int], k: int) -> int:
        if len(set(nums)) == 1:
            return nums[0]
        left = [x for x in nums if x < nums[0]]
        middle = [x for x in nums if x == nums[0]]
        right = [x for x in nums if x > nums[0]]
        if k <= len(right):
            return self.findKthLargest(right, k)
        elif k<= len(right) + len(middle):
            return middle[0]
        else:
            return self.findKthLargest(left, k -len(right) - len(middle) )
