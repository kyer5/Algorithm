import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        for (int i = 0; i < t; i++) {
            int n = sc.nextInt();
            long[] dp = new long[n + 5];

            dp[1] = 1;
            dp[2] = 1;
            dp[3] = 1;
            dp[4] = 2;
            dp[5] = 2;

            for (int j = 5; j < n + 5; j++) {
                dp[j] = dp[j - 1] + dp[j - 5];
            }

            System.out.println(dp[n]);
        }
    }
}