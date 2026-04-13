import java.io.*;
import java.util.*;
import java.math.BigInteger;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        m = Math.min(m, n - m);

        BigInteger result = BigInteger.ONE;

        for (int i = 1; i <= m; i++) {
            result = result.multiply(BigInteger.valueOf(n - i + 1))
                           .divide(BigInteger.valueOf(i));
        }

        System.out.println(result);
    }
}