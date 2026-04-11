import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        boolean[] isNotPrime = new boolean[1000001];

        isNotPrime[0] = isNotPrime[1] = true;
        for (int i = 2; i * i <= 1000000; i++) {
            if (!isNotPrime[i]) {
                for (int j = i * i; j <= 1000000; j += i) {
                    isNotPrime[j] = true;
                }
            }
        }

        while (true) {
            int num = Integer.parseInt(br.readLine());

            if (num == 0) {
                break;
            }

            int a = 0;
            int b = 0;

            for (int i = 3; i <= num / 2; i += 2) {
                if (!isNotPrime[i] && !isNotPrime[num - i]) {
                    a = i;
                    b = num - i;
                    break;
                }
            }

            sb.append(num).append(" = ").append(a).append(" + ").append(b).append("\n");
        }
        System.out.println(sb);
    }
}