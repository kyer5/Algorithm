import java.io.*;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(st.nextToken());
        int S = Integer.parseInt(st.nextToken());

        int[] locations = new int[N];
        int[] sizes = new int[N];

        st = new StringTokenizer(br.readLine());

        for (int i = 0; i < N; i++) {
            locations[i] = Integer.parseInt(st.nextToken());
        }

        for (int i = 0; i < N; i++) {
            sizes[i] = Math.abs(S - locations[i]);
        }

        int gcd = sizes[0];
        for (int i = 1; i < sizes.length; i++) {
            gcd = gcd(gcd, sizes[i]);
        }

        sb.append(gcd);
        System.out.println(sb);
    }

    public static int gcd(int a, int b) {
        if (b == 0) {
            return a;
        } else {
            return gcd(b, a % b);
        }
    }
}