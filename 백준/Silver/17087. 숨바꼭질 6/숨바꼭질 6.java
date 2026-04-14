import java.io.*;
import java.util.*;

public class Main {

    public static int gcd(int a, int b) {
        while (b != 0) {
            int r = a % b;
            a = b;
            b = r;
        }
        return a;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int s = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        int gcd = 0;
        for (int i = 0; i < n; i++) {
            int p = Integer.parseInt(st.nextToken());
            gcd = gcd(gcd, Math.abs(s - p));
        }

        System.out.println(gcd);
    }
}