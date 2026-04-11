import java.io.*;
import java.util.*;

public class Main {
    static int[] arr;
    static int[] result;

    public static void dfs(int start, int depth) {
        if (depth == 6) {
            for (int num : result) {
                System.out.print(num + " ");
            }
            System.out.println();
            return;
        }

        for (int i = start; i < arr.length; i++) {
            result[depth] = arr[i];
            dfs(i + 1, depth + 1);
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while (true) {
            StringTokenizer st = new StringTokenizer(br.readLine());

            int k = Integer.parseInt(st.nextToken());

            if (k == 0) {
                break;
            }

            arr = new int[k];
            result = new int[6];

            for (int i = 0; i < k; i++) {
                arr[i] = Integer.parseInt(st.nextToken());
            }

            dfs(0, 0);
            System.out.println();
        }
    }
}