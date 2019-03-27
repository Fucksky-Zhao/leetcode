import java.util.*;

class Coin {
    public static long[][] dp;

    public static long count(int[] S, int m, int n) {
        dp = new long[m + 1][n + 1];
        return helper(S, m, n);
    }

    public static long helper(int[] S, int m, int n) {
        if (m >= 0 && n >= 0 && dp[m][n] != 0) {
            return dp[m][n];
        }
        if (n == 0) {
            if (m >= 0) dp[m][n] = 1;
            return 1;
        }
        if (n < 0) {
            return 0;
        }
        if (m <= 0) {
            return 0;
        }
        dp[m][n] = helper(S, m - 1, n) + helper(S, m, n - S[m - 1]);
        return dp[m][n];
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] S = {1,5,10,20,50,100};
        System.out.println(count(S, 6, n));
    }
}
