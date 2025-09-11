import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static int getDiff(int i, int j, int k, int[] arr) {
        int sum1 = arr[i] + arr[j] + arr[k];
        int sum2 = 0;
        for (int l = 0; l < 6; l++) {
            sum2 += arr[l];
        }
        sum2 -= sum1;
        return Math.abs(sum1 - sum2);
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int[] arr = new int[6];

        for (int i = 0; i < 6; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        int minDiff = Integer.MAX_VALUE;
        for (int i = 0; i < 6; i++) {
            for (int j = i + 1; j < 6; j++) {
                for (int k = j + 1; k < 6; k++) {
                    minDiff = Math.min(minDiff, getDiff(i, j, k, arr));
                }
            }
        }

        System.out.println(minDiff);
    }
}
