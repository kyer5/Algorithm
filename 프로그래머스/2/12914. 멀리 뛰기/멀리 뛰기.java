class Solution {
    public long solution(int n) {
        long answer;
        long[] dp = new long[n + 2];

        dp[0] = 0;
        dp[1] = 1;

        for (int i = 2; i < n + 2; i++) {
            dp[i] = dp[i - 2] + dp[i - 1] % 1234567;
        }

        answer = dp[n + 1] % 1234567;
        return answer;
    }
}