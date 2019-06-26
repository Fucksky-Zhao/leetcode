class Solution:
    def thirdMax(self, nums: List[int]) -> int:
        nums = set(nums)
        nums = list(nums)
        if len(nums) < 3:
            return max(nums)

        return self.findMedian(nums, 3)

    def findMedian(self, nums, k):
        if k == 0:
            return nums[0]
        if len(nums) <= 1:
            return nums[0]
        pivot = nums[len(nums) // 2]
        left = [x for x in nums if x < pivot]
        middle = [x for x in nums if x == pivot]
        right = [x for x in nums if x > pivot]

        if len(right) >= k:
            return self.findMedian(right, k)
        if len(right + middle) >= k:
            return pivot
        else:
            return self.findMedian(left, k - len(right + middle))
