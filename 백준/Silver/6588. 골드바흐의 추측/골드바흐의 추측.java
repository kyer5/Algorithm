import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb;

        boolean[] isPrimeArray = new boolean[1000000];

        isPrimeArray[0] = isPrimeArray[1] = true;

        for (long i = 2; i < isPrimeArray.length; i++) {
            if (!isPrimeArray[(int) i]) {
                for (long j = i * i; j < isPrimeArray.length; j += i) {
                    isPrimeArray[(int) j] = true;
                }
            }
        }

        while (true) {
            sb = new StringBuilder();
            int n = Integer.parseInt(br.readLine());

            if (n == 0) {
                break;
            }

            if (n % 2 == 1) {
                sb.append("Goldbach's conjecture is wrong.");
                System.out.println(sb);
                continue;
            }

            for (int j = 3; j <= n / 2; j++) {
                if (!isPrimeArray[j] && !isPrimeArray[n - j]) {
                    sb.append(n).append(" = ").append(j).append(" + ").append(n - j);
                    break;
                }
            }
            System.out.println(sb);
        }
        br.close();
    }
}