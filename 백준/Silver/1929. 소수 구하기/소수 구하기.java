import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] input = br.readLine().split(" ");
        int m = Integer.parseInt(input[0]);
        int n = Integer.parseInt(input[1]);

        boolean[] isNotPrime = new boolean[n + 1];
        isNotPrime[0] = isNotPrime[1] = true;

        for (int i = 2; i * i <= n; i++) {
            if (!isNotPrime[i]) {
                for (int j = i * i; j <= n; j += i) {
                    isNotPrime[j] = true;
                }
            }
        }

        StringBuilder sb = new StringBuilder();
        for (int i = m; i <= n; i++) {
            if (!isNotPrime[i]) {
                sb.append(i).append('\n');
            }
        }

        System.out.println(sb);
    }
}
