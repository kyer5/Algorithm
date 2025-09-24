import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static final int MIN_VALUE = Integer.MIN_VALUE;

    public static int n;
    public static int[] dp;
    public static int[] arr;

    public static void initialize() {
        for (int i = 0; i < n; i++) {
            dp[i] = MIN_VALUE;
        }
        dp[1] = arr[1];
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        n = Integer.parseInt(br.readLine());
        arr = new int[n + 1];
        dp = new int[n + 1];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 1; i <= n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        initialize();

        for (int i = 2; i <= n; i++) {
            dp[i] = Math.max(dp[i - 1] + arr[i], arr[i]);
        }

        int result = MIN_VALUE;
        for (int i = 1; i <= n; i++) {
            result = Math.max(result, dp[i]);
        }

        System.out.println(result);
    }
}
