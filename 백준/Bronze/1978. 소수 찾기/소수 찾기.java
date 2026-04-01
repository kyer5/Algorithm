import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] number = new int[n];
        int max = 0;
        for (int i = 0; i < n; i++) {
            number[i] = Integer.parseInt(st.nextToken());
            if (number[i] > max) {
                max = number[i];
            }
        }

        boolean[] isNotPrime = new boolean[max + 1];
        isNotPrime[0] = isNotPrime[1] = true;

        for (int i = 2; i * i <= max; i++) {
            if (!isNotPrime[i]) {
                for (int j = i * i; j <= max; j += i) {
                    isNotPrime[j] = true;
                }
            }
        }

        int cnt = 0;
        for (int i : number) {
            if (!isNotPrime[i]) {
                cnt++;
            }
        }

        System.out.println(cnt);
    }
}
