import java.io.*;
import java.math.BigInteger;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int N = Integer.parseInt(br.readLine().trim());
        StringTokenizer st = new StringTokenizer(br.readLine());
        BigInteger NNum = BigInteger.ONE;
        for (int i = 0; i < N; i++) {
            NNum = NNum.multiply(new BigInteger(st.nextToken()));
        }

        int M = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        BigInteger MNum = BigInteger.ONE;
        for (int i = 0; i < M; i++) {
            MNum = MNum.multiply(new BigInteger(st.nextToken()));
        }

        BigInteger gcd = NNum.gcd(MNum);

        String str = String.valueOf(gcd);
        if (str.length() > 9) {
            System.out.println(str.substring(str.length() - 9));
        } else {
            System.out.println(str);
        }
    }

    public static int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}