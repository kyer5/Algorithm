import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        boolean[] isPrimes = new boolean[1000001];
        isPrimes[0] = isPrimes[1] = true;

        for (int i = 2; i <= Math.sqrt(1000000); i++) {
            for (int j = i + i; j < isPrimes.length; j += i) {
                if (!isPrimes[j]) {
                    isPrimes[j] = true;
                }
            }
        }

        int T = Integer.parseInt(br.readLine());

        for (int i = 0; i < T; i++) {
            int count = 0;
            int N = Integer.parseInt(br.readLine());
            for (int j = 2; j <= N / 2; j++) {
                if (!isPrimes[j] && !isPrimes[N - j]) {
                    count++;
                }
            }

            System.out.println(count);
        }
    }
}