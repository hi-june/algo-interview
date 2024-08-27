package idis;

public class Q3 {
    /**
     * 이항 계수의 성질
     */
    public static int[][] dp;

    public static void main(String[] args) {
        // 0 < k < n <= 100
        int n = 100, k = 4;

        // before
        // System.out.println(before(5, 2));

        // after
        dp = new int[n + 1][k + 1];
        System.out.println(after(n, k));
    }

    // 기존 코드 - O(2^N)
    public static int before(int n, int k) {
        if (k == 0 || n == k) {
            return 1;
        } else {
            return before(n - 1, k - 1) + before(n - 1, k);
        }
    }

    // 개선된 코드(dp: top-down) - O(N)
    public static int after(int n, int k) {
        // 이미 풀었던 sub 문제일 경우 값을 재활용
        if (dp[n][k] > 0) {
            return dp[n][k];
        }

        // 2번 성질
        if (k == 0 || n == k) {
            return dp[n][k] = 1;
        }

        // 1번 성질
        return dp[n][k] = after(n - 1, k - 1) + after(n - 1, k);
    }
}
