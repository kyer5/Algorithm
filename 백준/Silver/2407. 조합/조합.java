import java.io.*;
import java.math.BigInteger;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        BigInteger numerator = BigInteger.valueOf(n);
        BigInteger denominator = BigInteger.valueOf(1);

        for (int i = 1; i < n; i++) {
            numerator = numerator.multiply(BigInteger.valueOf(i));
        }

        for (int i = 1; i <= n - m; i++) {
            denominator = denominator.multiply(BigInteger.valueOf(i));
        }

        for (int i = 1; i <= m; i++) {
            denominator = denominator.multiply(BigInteger.valueOf(i));
        }
        
        System.out.println(numerator.divide(denominator));
    }
}