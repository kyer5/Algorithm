import java.io.*;
import java.util.*;

public class Main {

    static int n;
    static int[] result;
    static boolean[] visited;
    static StringBuilder sb = new StringBuilder();

    public static void dfs(int depth) {
        if (depth == n) {
            for (int num : result) {
                sb.append(num).append(" ");
            }
            sb.append("\n");
            return;
        }

        for (int i = 0; i < n; i++) {
            if (!visited[i]) {
                visited[i] = true;
                result[depth] = i + 1;

                dfs(depth + 1);

                visited[i] = false;
            }
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        n = Integer.parseInt(br.readLine());

        result = new int[n];
        visited = new boolean[n];

        dfs(0);

        System.out.println(sb);
    }
}