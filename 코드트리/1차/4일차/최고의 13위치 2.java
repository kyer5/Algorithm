import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        int[][] arr = new int[N][N];

        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j = 0; j < N; j++) {
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        int maxCoins = 0;
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N - 2; j++) {
                int sum1 = arr[i][j] + arr[i][j + 1] + arr[i][j + 2];

                for (int k = 0; k < N; k++) {
                    for (int l = 0; l < N - 2; l++) {
                        if (overlap(i, j, k, l)) {
                            continue;
                        }
                        int sum2 = arr[k][l] + arr[k][l + 1] + arr[k][l + 2];
                        maxCoins = Math.max(maxCoins, sum1 + sum2);
                    }
                }
            }
        }

        System.out.println(maxCoins);
    }

    public static boolean overlap(int i, int j, int k, int l) {
        if (i != k){
            return false;
        }
        return !(j + 2 < l || l + 2 < j);
    }
}
