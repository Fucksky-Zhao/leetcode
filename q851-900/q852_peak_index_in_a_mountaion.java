class Solution {
    public int peakIndexInMountainArray(int[] A) {
        int low = 0;
        int high = A.length - 1;
        int middle = (low + high) / 2;
        while (low <= high) {
            if (A[middle] > A[middle + 1] && A[middle] > A[middle - 1]) return middle;
            else if (A[middle] > A[middle + 1]) {
                high = middle - 1;
                middle = (low + high) / 2;
            } else {
                low = middle + 1;
                middle = (low + high) / 2;
            }
        }
        return middle;
    }
}
