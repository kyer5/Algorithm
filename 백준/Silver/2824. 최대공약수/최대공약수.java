import java.io.*;
import java.util.*;

public class Main {

    public static long gcd(long a, long b) {
        while (b != 0) {
            long r = a % b;
            a = b;
            b = r;
        }
        return a;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        long[] a = new long[n];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            a[i] = Long.parseLong(st.nextToken());
        }

        int m = Integer.parseInt(br.readLine());
        long[] b = new long[m];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < m; i++) {
            b[i] = Long.parseLong(st.nextToken());
        }

        long result = 1;
        boolean overflow = false;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                long g = gcd(a[i], b[j]);

                if (g > 1) {
                    result *= g;

                    if (result >= 1_000_000_000) {
                        result %= 1_000_000_000;
                        overflow = true;
                    }
                    a[i] /= g;
                    b[j] /= g;
                }
            }
        }

        if (overflow) {
            System.out.printf("%09d\n", result);
        } else {
            System.out.println(result);
        }
    }
}