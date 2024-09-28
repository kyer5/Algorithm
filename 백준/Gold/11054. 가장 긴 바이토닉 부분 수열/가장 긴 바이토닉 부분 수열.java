import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] arr = new int[N];
        int[] r_dp = new int[N];
        int[] l_dp = new int[N];
        int[] sum = new int[N];

        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
            r_dp[i] = 1;
            l_dp[i] = 1;
        }

        for (int i = 1; i < N; i++) {
            for (int j = 0; j < i; j++) {
                if (arr[i] > arr[j] && r_dp[i] <= r_dp[j]) {
                    r_dp[i] = r_dp[j] + 1;
                }
            }
        }

        for (int i = N - 2; i >= 0; i--) {
            for (int j = i + 1; j < N; j++) {
                if (arr[i] > arr[j] && l_dp[i] <= l_dp[j]) {
                    l_dp[i] = l_dp[j] + 1;
                }
            }
        }

        for (int i = 0; i < N; i++) {
            sum[i] = r_dp[i] + l_dp[i] - 1;
        }

        int max = Integer.MIN_VALUE;
        for (int i = 0; i < N; i++) {
            max = Math.max(max, sum[i]);
        }

        System.out.println(max);
    }
}