import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());

        int n = Integer.parseInt(br.readLine());
        int[] a = new int[n];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            a[i] = Integer.parseInt(st.nextToken());
        }

        int m = Integer.parseInt(br.readLine());
        int[] b = new int[m];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < m; i++) {
            b[i] = Integer.parseInt(st.nextToken());
        }

        int[] pSumA = new int[n];
        int[] pSumB = new int[m];

        pSumA[0] = a[0];
        for (int i = 1; i < n; i++) {
            pSumA[i] = pSumA[i - 1] + a[i];
        }

        pSumB[0] = b[0];
        for (int i = 1; i < m; i++) {
            pSumB[i] = pSumB[i - 1] + b[i];
        }

        List<Integer> finalA = new ArrayList<>();
        List<Integer> finalB = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                if (i == 0) finalA.add(pSumA[j]);
                else finalA.add(pSumA[j] - pSumA[i - 1]);
            }
        }

        for (int i = 0; i < m; i++) {
            for (int j = i; j < m; j++) {
                if (i == 0) finalB.add(pSumB[j]);
                else finalB.add(pSumB[j] - pSumB[i - 1]);
            }
        }

        Collections.sort(finalA);
        Collections.sort(finalB);

        int left = 0;
        int right = finalB.size() - 1;
        long cnt = 0;

        while (left < finalA.size() && right >= 0) {
            int sum = finalA.get(left) + finalB.get(right);

            if (sum == t) {
                int aVal = finalA.get(left);
                int bVal = finalB.get(right);

                long countA = 0;
                long countB = 0;

                while (left < finalA.size() && finalA.get(left) == aVal) {
                    left++;
                    countA++;
                }

                while (right >= 0 && finalB.get(right) == bVal) {
                    right--;
                    countB++;
                }

                cnt += countA * countB;
            }
            else if (sum < t) {
                left++;
            }
            else {
                right--;
            }
        }

        System.out.println(cnt);
    }
}