import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String n = sc.next();
        int[] dp = new int[n.length() + 1];

        dp[0] = 1;

        if (n.charAt(0) != '0') {
            dp[1] = 1;
        }

        for (int i = 2; i <= n.length(); i++) {
            if (n.charAt(i - 1) != '0') {
                dp[i] = dp[i - 1] % 1000000;
            }

            int result = Integer.parseInt(n.substring(i - 2, i));
            if (result >= 10 && result <= 26) {
                dp[i] = (dp[i] + dp[i - 2]) % 1000000;
            }
        }

        System.out.println(dp[n.length()] % 1000000);
    }
}
