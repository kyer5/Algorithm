import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long[][] dp = new long[n + 1][10];

        for (int i = 0; i < 10; i++) {
            dp[0][i] = 1;
        }

        for (int i = 1; i < n; i++) {
            for (int j = 0; j < 10; j++) {
                for (int k = j; k < 10; k++) {
                    dp[i][j] += dp[i - 1][k];
                    dp[i][j] %= 10007;
                }
            }
        }

        long sum = 0;
        for (int i = 0; i < 10; i++) {
            sum += dp[n - 1][i];
            sum %= 10007;
        }

        System.out.println(sum);
    }
}
