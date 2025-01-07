import java.io.*;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());
        long[] arr = new long[n];
        int[] count = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = Long.parseLong(br.readLine());
        }

        Arrays.sort(arr);
        count[0] = 1;
        int maxCnt = 1;
        long maxNum = arr[0];

        for (int i = 1; i < n; i++) {
            count[i] = 1;
            if (arr[i] == arr[i - 1]) {
                count[i] = count[i-1] + 1;
            }
            if (count[i] > maxCnt) {
                maxCnt = count[i];
                maxNum = arr[i];
            }
        }

        sb.append(maxNum);
        System.out.println(sb);

    }
}