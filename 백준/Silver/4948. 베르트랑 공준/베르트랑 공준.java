import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while (true) {
            int n = Integer.parseInt(br.readLine());

            if (n == 0) {
                break;
            }

            boolean[] isPrime = new boolean[2 * n + 1];

            isPrime[0] = isPrime[1] = true;

            for (int i = 2; i * i <= 2 * n; i++) {
                if (!isPrime[i]) {
                    for (int j = i * i; j <= 2 * n; j += i) {
                        isPrime[j] = true;
                    }
                }
            }

            int count = 0;
            for (int i = n + 1; i <= 2 * n; i++) {
                if (!isPrime[i]) {
                    count++;
                }
            }

            System.out.println(count);
        }
    }
}