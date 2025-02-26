import java.io.*;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();

        int num1 = Integer.parseInt(st.nextToken());
        int num2 = Integer.parseInt(st.nextToken());

        int greatestCommonDivisor = 1;
        int leastCommonMultiple = 1;

        int min = Math.min(num1, num2);

        for (int i = 2; i <= min; i++) {
            while (num1 % i == 0 && num2 % i == 0) {
                greatestCommonDivisor *= i;
                num1 /= i;
                num2 /= i;
            }
        }

        leastCommonMultiple = greatestCommonDivisor * num1 * num2;

        sb.append(greatestCommonDivisor).append("\n").append(leastCommonMultiple);
        System.out.println(sb);
        br.close();
    }
}