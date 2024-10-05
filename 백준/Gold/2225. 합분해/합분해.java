import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        long[][] dp = new long[n + 1][k + 2];

        if (k > 0) {
            for (int i = 0; i < k + 1; i++) {
                dp[1][i] = i;
            }
        }
        
        for (int i = 2; i <= n; i++) {
            dp[i][1] = 1;
            dp[i][2] = i + 1;
        }

        for (int i = 2; i <= n; i++) {
            if (k > 2) {
                for (int j = 3; j < k + 1; j++) {
                    dp[i][j] = (dp[i-1][j] + dp[i][j-1]) % 1000000000;
                }
            }
        }

        System.out.println(dp[n][k] % 1000000000);
    }
}