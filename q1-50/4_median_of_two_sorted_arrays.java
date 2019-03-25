class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int m = nums1.length;
        int n = nums2.length;
        if (m > n) {
            int[] temp = nums1;
            nums1 = nums2;
            nums2 = temp;
            int tem = m;
            m = n;
            n = tem;
        }
        int imin = 0, imax = m;
        while (imin <= imax) {
            int i = (imin + imax) / 2;
            int j = (m + n + 1) / 2 - i;
            if (i > 0 && nums1[i - 1] > nums2[j]) {
                imax = i - 1;
            } else if (i < m && nums2[j - 1] > nums1[i]) {
                imin = i + 1;
            } else {
                //寻找左边最大和右边最小，分别返回
                int leftMax, rightMin;
                if (i == 0) leftMax = nums2[j - 1];
                else if (j == 0) leftMax = nums1[i - 1];
                else leftMax = Math.max(nums1[i - 1], nums2[j - 1]);

                if ((m + n) % 2 == 1) return (float) leftMax;

                if (i == m) rightMin = nums2[j];
                else if (j == n) rightMin = nums1[i];
                else rightMin = Math.min(nums1[i], nums2[j]);

                return ((float)(leftMax + rightMin)) / 2;
            }
        }
        return 0.0;
    }
}
