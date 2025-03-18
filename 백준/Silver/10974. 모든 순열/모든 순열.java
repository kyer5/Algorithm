import java.io.*;

public class Main {
    static int N;
    static int[] arr;
    static int[] res;
    static boolean[] visit;
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        N = Integer.parseInt(br.readLine());
        arr = new int[N];
        res = new int[N];
        visit = new boolean[N];

        for (int i = 1; i <= N; i++) {
            arr[i - 1] = i;
        }

        backtracking(0);
        System.out.println(sb);
    }

    public static void backtracking(int depth) {
        if (depth == N) {
            for (int i : res) {
                sb.append(i).append(" ");
            }
            sb.append("\n");
            return;
        }

        for (int i = 0; i < N; i++) {
            if (visit[i]) {
                continue;
            }
            if (!visit[i]) {
                visit[i] = true;
                res[depth] = i + 1;
                backtracking(depth + 1);
                visit[i] = false;
            }
        }
    }
}