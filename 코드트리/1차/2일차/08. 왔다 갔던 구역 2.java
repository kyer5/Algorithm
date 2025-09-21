import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static final int OFFSET = 1000;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int n = Integer.parseInt(br.readLine());
        int[] line = new int[2001];

        int current = 0;
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            int seconds = Integer.parseInt(st.nextToken());
            String direction = st.nextToken();

            for (int j = 0; j < seconds; j++) {
                int prev = current;
                switch (direction) {
                    case "L":
                        current--;
                        break;
                    case "R":
                        current++;
                        break;
                }

                int min = Math.min(prev, current);
                line[min + OFFSET]++;
            }
        }

        int result = 0;
        for (int i : line) {
            if (i >= 2) {
                result++;
            }
        }

        System.out.println(result);
    }
}
