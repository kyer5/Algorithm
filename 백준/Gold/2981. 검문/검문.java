import java.io.*;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }

        Arrays.sort(arr);

        int gcdVal = arr[1] - arr[0];

        for (int i = 2; i < N; i++) {
            gcdVal = gcd(gcdVal, arr[i] - arr[i - 1]);
        }

        for (int i = 2; i <= gcdVal; i++) {
            if (gcdVal % i == 0) {
                System.out.print(i + " ");
            }
        }
    }

    public static int gcd(int a, int b) {
        while (b != 0) {
            int r = a % b;
            a = b;
            b = r;
        }
        return a;
    }
}