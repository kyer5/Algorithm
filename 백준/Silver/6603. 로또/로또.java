import java.io.*;
import java.util.StringTokenizer;

public class Main {
    static int T;
    static int[] arr;
    static int[] lotto;
    static boolean[] visit;
    static StringBuilder sb;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while (true) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            sb = new StringBuilder();

            T = Integer.parseInt(st.nextToken());
            if (T == 0) {
                break;
            }

            arr = new int[T];
            for (int i = 0; i < T; i++) {
                arr[i] = Integer.parseInt(st.nextToken());
            }

            lotto = new int[6];
            visit = new boolean[T];
            backtracking(0, 0);

            System.out.println(sb);
        }
    }

    public static void backtracking(int index, int depth) {
        if (depth == 6) {
            for (int i : lotto) {
                sb.append(i).append(" ");
            }
            sb.append("\n");
            return;
        }

        for (int i = index; i < T; i++) {
            if (!visit[i]) {
                visit[i] = true;
                lotto[depth] = arr[i];
                backtracking(i, depth + 1);
                visit[i] = false;
            }
        }
    }
}