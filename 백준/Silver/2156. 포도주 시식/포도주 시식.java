import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] dp = new int[n + 1];
        int[] wine = new int[n + 1];
        wine[0] = 0;

        for (int i = 1; i <= n; i++) {
            wine[i] = sc.nextInt();
        }

        for (int i = 1; i <= n; i++) {
            if (i == 1) {
                dp[1] = wine[1];
            } else if (i == 2) {
                dp[2] = wine[1] + wine[2];
            } else {
                dp[i] = Math.max(dp[i - 1], Math.max(dp[i - 2] + wine[i], dp[i - 3] + wine[i] + wine[i - 1]));
            }
        }

        System.out.println(dp[n]);
    }
}