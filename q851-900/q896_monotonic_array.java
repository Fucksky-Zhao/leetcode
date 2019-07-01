class Solution {
    public boolean isMonotonic(int[] A) {
        boolean increase = true, decrease = true;
        for (int i = 1; i < A.length; i++) {
            if (A[i] > A[i-1]) decrease = false;
            if (A[i] < A[i-1]) increase = false;
            if (!increase && !decrease) return false;
        }
        return true;
    }
}
