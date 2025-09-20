import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        int[] arr = new int[1000];

        int max = 1;
        int maxValue = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(br.readLine());

            if (n == 1) {
                System.out.println(1);
                return;
            }

            if (i > 0) {
                if (arr[i - 1] == arr[i]) {
                    max++;
                    maxValue = Math.max(max, maxValue);
                } else {
                    max = 1;
                }
            }
        }

        System.out.println(maxValue);
    }
}
