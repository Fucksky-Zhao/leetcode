class Solution:
    def removeElement(self, nums: List[int], val: int) -> int:
        j = 0
        for i in range(len(nums)):
            while i < len(nums) and nums[i] == val:
                del nums[i]
        return len(nums)
