import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[][] arr = new int[N][2];

        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            arr[i][0] = Integer.parseInt(st.nextToken());
            arr[i][1] = Integer.parseInt(st.nextToken());
        }

        int maxExtend = 0;
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                for (int k = 0; k < N; k++) {
                    if (i == j || j == k || k == i)
                        continue;

                    if (arr[i][0] == arr[j][0] && arr[i][1] == arr[k][1]) {
                        int width = Math.abs(arr[j][1] - arr[i][1]);
                        int height = Math.abs(arr[k][0] - arr[i][0]);
                        int extend = width * height;
                        maxExtend = Math.max(maxExtend, extend);
                    }
                }
            }
        }

        System.out.println(maxExtend);
    }
}
