import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int T = Integer.parseInt(br.readLine());

        for (int i = 0; i < T; i++) {
            int n = Integer.parseInt(br.readLine());

            boolean[] isPrime = new boolean[n + 1];

            isPrime[0] = isPrime[1] = true;

            for (int j = 2; j * j < n; j++) {
                if (!isPrime[j]) {
                    for (int k = j * j; k < n; k += j) {
                        isPrime[k] = true;
                    }
                }
            }

            int prime1 = 0;
            int prime2 = 0;

            for (int j = 2; j <= n / 2; j++) {
                if (!isPrime[j] && !isPrime[n - j]) {
                    prime1 = j;
                    prime2 = n - j;
                }
            }

            sb.append(prime1).append(" ").append(prime2).append("\n");
        }
        System.out.println(sb);
        br.close();
    }
}