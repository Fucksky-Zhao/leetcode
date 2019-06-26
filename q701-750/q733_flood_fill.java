class Solution {


    public int[][] floodFill(int[][] image, int sr, int sc, int newColor) {
        int color = image[sr][sc];

        if (color != newColor) dfs(image, sr, sc, color, newColor);
        return image;
    }

    private void dfs(int[][] image, int sr, int sc,int color, int newColor) {

        if (image[sr][sc] != color) return;
        image[sr][sc] = newColor;

        int m = image.length;
        int n = image[0].length;

        if (sr >= 1) dfs(image, sr-1, sc, color, newColor);
        if (sr < m-1) dfs(image, sr+1, sc, color, newColor);
        if (sc >= 1) dfs(image, sr, sc-1, color, newColor);
        if (sc < n-1) dfs(image, sr, sc+1, color, newColor);
    }

}
