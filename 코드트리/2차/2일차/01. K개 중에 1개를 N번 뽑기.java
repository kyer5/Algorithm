import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static int k, n;
    public static int[] arr;
    public static StringBuilder sb = new StringBuilder();

    public static void print() {
        for (int i = 0; i < n; i++) {
            sb.append(arr[i]).append(" ");
        }
        sb.append("\n");
    }

    public static void recursion(int depth) {
        if (depth == n) {
            print();
            return;
        }

        for (int i = 1; i <= k; i++) {
            arr[depth] = i;
            recursion(depth + 1);
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        k = Integer.parseInt(st.nextToken());
        n = Integer.parseInt(st.nextToken());

        arr = new int[n];

        recursion(0);
        System.out.println(sb);
    }
}
