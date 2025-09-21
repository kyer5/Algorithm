import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static boolean inRange(int x, int y, int n) {
        if (x >= 0 && x < n) {
            if (y >= 0 && y < n) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int r = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());
        int[][] arr = new int[n][n];

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < n; j++) {
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        int[] dx = {-1, 1, 0, 0};
        int[] dy = {0, 0, -1, 1};

        int cnt = 0;
        int currentX = r - 1;
        int currentY = c - 1;

        System.out.print(arr[currentX][currentY] + " ");

        while (true) {
            boolean moved = false;
            for (int i = 0; i < 4; i++) {
                int nextX = currentX + dx[i];
                int nextY = currentY + dy[i];
                if (inRange(nextX, nextY, n) && arr[nextX][nextY] > arr[currentX][currentY]) {
                    currentX = nextX;
                    currentY = nextY;
                    System.out.print(arr[currentX][currentY] + " ");
                    moved = true;
                    break;
                }
            }
            if (!moved) {
                break;
            }
        }
    }
}
