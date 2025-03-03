import java.io.*;
import java.util.StringTokenizer;

public class Main {
    static int N;
    static int M;
    static int[] arr;
    static boolean[] visit;
    static StringBuilder sb;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        sb = new StringBuilder();

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        arr = new int[M];
        visit = new boolean[N + 1];

        backtracking(1, 0);
        System.out.println(sb);
    }

    public static void backtracking(int index, int depth) {
        if (depth == M) {
            for (int i : arr) {
                sb.append(i).append(" ");
            }
            sb.append("\n");
            return;
        }

        for (int i = index; i <= N; i++) {
            if (!visit[i]) {
                visit[i] = true;
                arr[depth] = i;
                backtracking(i, depth + 1);
                visit[i] = false;
            }
        }
    }
}