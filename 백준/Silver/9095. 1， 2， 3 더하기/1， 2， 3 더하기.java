import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        for (int i = 0; i < T; i++) {
            int n = sc.nextInt();
            Integer[] dp = new Integer[n + 1];

            dp[0] = 1;
            dp[1] = 1;

            if (n > 1 && n < 11) {
                dp[2] = 2;
                for (int j = 3; j < n + 1; j++) {
                    dp[j] = dp[j - 3] + dp[j - 2] + dp[j - 1];
                }
            }
            System.out.println(dp[n]);
        }
    }
}
