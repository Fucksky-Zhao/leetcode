class Solution:
    def findMedianSortedArrays(self, nums1: List[int], nums2: List[int]) -> float:
        m = len(nums1)
        n = len(nums2)
        if m > n:
            nums1, nums2 = nums2, nums1
            m, n = n, m
        imin, imax = 0, m
        while imin <= imax:
            i = (imin + imax) // 2
            j = (m + n + 1) // 2 - i
            if i < m and nums2[j - 1] > nums1[i]:
                imin = i + 1
            elif i > 0 and nums1[i - 1] > nums2[j]:
                imax = i - 1
            else:
                #取左边最小和右边最大
                if i == 0: left = nums2[j - 1]
                elif j == 0: left =nums1[i - 1]
                else: left = max(nums1[i - 1], nums2[j - 1])

                #如果总长度为奇数，必须在此时返回。
                #在后面返回将涉及到
                #测试用例 [], [1]
                #存在m = 0情况，此时nums1为空，最终i = 0, j = 1，但是nums2[1]不存在
                if (m + n) % 2 == 1:
                    return left

                if i == m: right = nums2[j]
                elif j == n: right = nums1[i]
                else: right = min(nums1[i], nums2[j])

                return float(left) if (m + n) % 2 == 1 else (left + right) /2
        
