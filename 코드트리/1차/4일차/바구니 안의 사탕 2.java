import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        int[] arr = new int[101];

        int minIdx = Integer.MAX_VALUE;
        int maxIdx = Integer.MIN_VALUE;
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            int candy = Integer.parseInt(st.nextToken());
            int idx = Integer.parseInt(st.nextToken());
            maxIdx = Math.max(maxIdx, idx);
            minIdx = Math.min(minIdx, idx);
            arr[idx] += candy;
        }

        int maxSum = 0;
        for (int c = minIdx; c <= 100; c++) {
            int sum = 0;
            for (int i = Math.max(0, c - K); i <= Math.min(100, c + K); i++) {
                if (i < 0) {
                    i = 0;
                }
                sum += arr[i];
            }
            maxSum = Math.max(sum, maxSum);
        }

        System.out.println(maxSum);
    }
}
