import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        
        int t = Integer.parseInt(br.readLine());

        for (int i = 0; i < t; i++) {
            int num = Integer.parseInt(br.readLine());
            boolean[] isNotPrime = new boolean[num + 1];

            isNotPrime[0] = isNotPrime[1] = true;
            for (int j = 2; j * j <= num; j++) {
                if (!isNotPrime[j]) {
                    for (int k = j * j; k <= num; k += j) {
                        isNotPrime[k] = true;
                    }
                }
            }

            int a = 0;
            int b = 0;

            for (int j = 2; j <= num / 2; j++) {
                if (!isNotPrime[j] && !isNotPrime[num - j]) {
                    a = j;
                    b = num - j;
                }
            }

            sb.append(a).append(" ").append(b).append("\n");
        }
        System.out.println(sb);
    }
}