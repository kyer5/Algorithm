import java.io.*;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int n = 1;
        ArrayList<Integer> list = new ArrayList<>();

        while (n != 0) {
            n = Integer.parseInt(br.readLine());
            if (n != 0) {
                list.add(n);
            }
        }

        int[] countArr = new int[list.size()];

        for (int i = 0; i < list.size(); i++) {
            boolean[] isPrime = new boolean[2 * list.get(i) + 1];

            isPrime[0] = true;
            isPrime[1] = true;

            for (int j = 2; j * j < isPrime.length; j++) {
                if (isPrime[j]) {
                    continue;
                }

                for (int k = j * j; k < isPrime.length; k += j) {
                    isPrime[k] = true;
                }
            }

            for (int j = list.get(i) + 1; j < isPrime.length; j++) {
                if (!isPrime[j]) {
                    countArr[i]++;
                }
            }
            sb.append(countArr[i]).append("\n");
        }

        System.out.println(sb);
        br.close();
    }
}