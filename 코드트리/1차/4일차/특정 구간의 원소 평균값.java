import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] arr = new int[N];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        int result = 0;
        for (int i = 0; i < N; i++) {
            for (int j = i; j < N; j++) {
                int sumVal = 0;
                for (int k = i; k <= j; k++) {
                    sumVal += arr[k];
                }

                int len = j - i + 1;
                if (sumVal % len == 0) {
                    int avg = sumVal / len;
                    for (int k = i; k <= j; k++) {
                        if (arr[k] == avg) {
                            result++;
                            break;
                        }
                    }
                }
            }
        }

        System.out.println(result);
    }
}
