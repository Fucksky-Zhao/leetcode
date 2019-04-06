class Solution:
    def removeDuplicates(self, nums: List[int]) -> int:
        for i in range(len(nums)):
            while i > 0 and i < len(nums) and nums[i] == nums[i - 1]:
                del nums[i]
        return len(nums)
