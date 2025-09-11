import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        int[] arrA = new int[N];
        int[] arrB = new int[M];

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            arrA[i] = Integer.parseInt(st.nextToken());
        }

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < M; i++) {
            arrB[i] = Integer.parseInt(st.nextToken());
        }

        int[] sortedB = arrB.clone();
        Arrays.sort(sortedB);

        int result = 0;
        for (int i = 0; i <= N - M; i++) {
            int[] sub = Arrays.copyOfRange(arrA, i, i + M);
            Arrays.sort(sub);
            if (Arrays.equals(sub, sortedB)) {
                result++;
            }
        }

        System.out.println(result);
    }
}
