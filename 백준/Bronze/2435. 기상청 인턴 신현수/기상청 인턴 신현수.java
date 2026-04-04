import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        int[] weathers = new int[n];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            weathers[i] = Integer.parseInt(st.nextToken());
        }

        int[] pSum = new int[n - k + 1];
        for (int i = 0; i <= n - k; i++) { // i = 8
            for (int j = 0; j < k; j++) {
                pSum[i] += weathers[i + j];
            }
        }

        int max = Integer.MIN_VALUE;
        for (int i = 0; i <= n - k; i++) {
            if (max < pSum[i]) {
                max = pSum[i];
            }
        }

        System.out.println(max);
    }
}