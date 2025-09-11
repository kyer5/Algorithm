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
        int[] line = new int[10005];

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            int idx = Integer.parseInt(st.nextToken());
            String str = st.nextToken();

            if (str.equals("G")) {
                line[idx] = 1;
            } else if (str.equals("H")) {
                line[idx] = 2;
            }
        }

        int max = 0;
        for (int i = 0; i <= 10005 - K; i++) {
            int sum = 0;
            for (int j = 0; j <= K && i + j < 10005; j++) {
                sum += line[i + j];
            }
            if (sum > max) {
                max = sum;
            }
        }

        System.out.println(max);
    }
}
