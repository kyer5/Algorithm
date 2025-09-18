import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static final int OFFSET = 100;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int n = Integer.parseInt(br.readLine());
        int[] line = new int[201];

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            int x1 = Integer.parseInt(st.nextToken());
            int x2 = Integer.parseInt(st.nextToken());

            for (int j = x1 + OFFSET; j < x2 + OFFSET; j++) {
                line[j]++;
            }
        }

        int max = Integer.MIN_VALUE;
        for (int i : line) {
            if (i >= max) {
                max = i;
            }
        }
        System.out.println(max);
    }
}

