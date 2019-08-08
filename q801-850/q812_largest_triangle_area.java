class Solution {
    public double largestTriangleArea(int[][] points) {
        int n = points.length;
        double ans = 0.0;
        for (int i = 0; i <= n - 3; i++) {
            for (int j = i + 1; j <= n - 2; j++) {
                for (int k = j + 1; k <= n - 1; k++) {
                    double dist1, dist2, dist3;
                    dist1 = distance(points[i], points[j]);
                    dist2 = distance(points[i], points[k]);
                    dist3 = distance(points[j], points[k]);
                    ans = Math.max(ans, area(dist1, dist2, dist3));
                }
            }
        }
        return ans;
    }

    private double distance(int[] a, int[] b) {
        double res = Math.sqrt((a[0] - b[0]) * (a[0] - b[0]) +
                               (a[1] - b[1]) * (a[1] - b[1]));
        return res;
    }

    private double area(double dist1, double dist2, double dist3) {
        double max = Math.max(Math.max(dist1, dist2), dist3);
        double min = Math.min(Math.min(dist1, dist2), dist3);
        double mid = dist1 + dist2 + dist3 - max - min;
        if (min + mid <= max) return 0.0;
        double p = (dist1 + dist2 + dist3) * 0.5;
        double res = Math.sqrt(p * (p - dist1) * (p - dist2) * (p - dist3));
        return res;
    }
}
