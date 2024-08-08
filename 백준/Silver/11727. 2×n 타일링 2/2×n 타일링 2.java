import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Integer[] dp = new Integer[n + 1];

        dp[0] = 1;
        dp[1] = 1;

        if (n >= 1 && n <= 1000) {
            for (int i = 2; i < n + 1; i++) {
                dp[i] = (dp[i - 2] * 2 + dp[i - 1]) % 10007;
            }
        } else {
            System.out.println("올바른 수를 입력하세요.");
        }

        System.out.println(dp[n]);
    }
}
