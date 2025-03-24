import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb;

        int T = Integer.parseInt(br.readLine());
        int[] NArr = new int[T];

        for (int i = 0; i < T; i++) {
            NArr[i] = (Integer.parseInt(br.readLine()));
        }

        for (int i = 0; i < T; i++) {
            sb = new StringBuilder();
            boolean[] isPrimes = new boolean[NArr[i] + 1];
            isPrimes[0] = isPrimes[1] = true;
            int count = 0;

            for (int j = 2; j <= NArr[i]; j++) {
                for (int k = j + j; k <= NArr[i]; k += j) {
                    if (!isPrimes[k]) {
                        isPrimes[k] = true;
                    }
                }
            }

            for (int j = 2; j <= NArr[i] / 2; j++) {
                if (!isPrimes[j] && !isPrimes[NArr[i] - j] && j + NArr[i] - j == NArr[i]) {
                    count++;
                }
            }

            sb.append(count);
            System.out.println(sb);
        }
    }
}