import java.util.*;

public class Coin2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        long[] dp = new long[n + 1];
        dp[0] = 1;
        int[] s = {1,5,10,20,50,100};
        for (int i = 0; i < s.length; i++) {
            for (int j = s[i]; j <= n; j++) {
                dp[j] = dp[j] + dp[j - s[i]];
            }
        }
        System.out.println(dp[n]);
    }
}
