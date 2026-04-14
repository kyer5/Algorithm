import java.io.*;
import java.util.*;

public class Main {

    static boolean[] isNotPrime = new boolean[1000001];

    public static void prime() {
        isNotPrime[0] = isNotPrime[1] = true;

        for (int i = 2; i * i <= 1000000; i++) {
            if (!isNotPrime[i])
                for (int j = i * i; j <= 1000000; j += i) {
                    isNotPrime[j] = true;
                }
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        prime();

        int t = Integer.parseInt(br.readLine());
        for (int i = 0; i < t; i++) {
            int num = Integer.parseInt(br.readLine());
            int cnt = 0;

            for (int j = 2; j <= num / 2; j++) {
                if (!isNotPrime[j] && !isNotPrime[num - j]) {
                    cnt++;
                }
            }

            sb.append(cnt).append("\n");
        }

        System.out.println(sb);
    }
}