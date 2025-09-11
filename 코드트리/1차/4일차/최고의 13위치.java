import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[][] arr = new int[N][N];

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        int result = 0;
        for (int i = 0; i < N; i++) {
            for (int j = 0; j <= N - 3; j++) {
                int cnt = 0;
                for (int k = 0; k < 3; k++) {
                    if (arr[i][j + k] == 1) {
                        cnt++;
                    }
                }
                if (result < cnt) {
                    result = cnt;
                }
            }
        }

        System.out.println(result);
    }
}
