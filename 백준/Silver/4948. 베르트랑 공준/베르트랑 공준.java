import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while (true) {
            int n = Integer.parseInt(br.readLine());

            if (n == 0) {
                break;
            }

            boolean[] isNotPrimes = new boolean[2 * n + 1];

            isNotPrimes[0] = isNotPrimes[1] = true;

            for (int i = 2; i * i <= 2 * n; i++) {
                if (!isNotPrimes[i]) {
                    for (int j = i * i; j <= 2 * n; j += i) {
                        isNotPrimes[j] = true;
                    }
                }
            }

            int cnt = 0;
            for (int i = n + 1; i <= 2 * n; i++) {
                if (!isNotPrimes[i]) {
                    cnt++;
                }
            }

            System.out.println(cnt);
        }
    }
}