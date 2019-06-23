class Solution {
    public int[][] flipAndInvertImage(int[][] A) {
        for (int[] a : A) {
            for (int i = 0; i < a.length; i++) {
                a[i] = (a[i] == 1) ? 0 : 1;
            }
            for (int i = 0; i < a.length / 2; i++) {
                int temp = a[i];
                a[i] = a[a.length - i - 1];
                a[a.length - i - 1] = temp;
            }
        }
        return A;
    }
}
