import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] dp = new int[n + 2];

        dp[2] = 3;
        for (int i = 4; i <= n; i += 2) {
            dp[i] += dp[i-2] * dp[2];
            for (int j = 2; j <= i - 4; j += 2) {
                dp[i] += 2 * dp[j];
            }
            dp[i] += 2;
        }

        System.out.println(dp[n]);
    }
}