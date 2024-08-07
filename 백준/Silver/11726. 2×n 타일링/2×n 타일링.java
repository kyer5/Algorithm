import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        Integer[] dp = new Integer[n + 1];
        dp[0] = 1;

        if (n > 0) {
            dp[1] = 1;
        }

        for (int i = 2; i < n + 1; i++) {
            if (dp[i] == null) {
                dp[i] = (dp[i - 2] + dp[i - 1]) % 10007;
            }
        }

        System.out.println(dp[n]);
    }
}
