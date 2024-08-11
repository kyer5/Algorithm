import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long mod = 1000000000;
        long result = 0;
        long[][] dp = new long[n][10];

        // n = 1
        for (int i = 0; i < 10; i++) {
            dp[0][i] = 1;
        }

        for (int i = 1; i < n; i++) {
            for (int j = 0; j < 10; j++) {
                if (j == 0) { // 첫째 자리가 0일 때 경우의 수
                    dp[i][0] = dp[i - 1][1] % mod;
                } else if (j > 0 && j < 9) { // 첫째 자리가 1 ~ 8일 때 경우의 수
                    dp[i][j] = (dp[i - 1][j - 1] + dp[i - 1][j + 1]) % mod;
                } else if (j == 9) { // 첫째 자리가 9일 때 경우의 수
                    dp[i][9] = dp[i - 1][8] % mod;
                }
            }
        }
        
        for (int i = 1; i < 10; i++) {
            result += dp[n - 1][i];
        }

        System.out.println(result % mod);
    }
}
