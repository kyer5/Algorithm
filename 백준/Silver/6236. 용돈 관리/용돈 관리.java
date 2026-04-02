import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int[] money = new int[n];
        
        int sum = 0;
        for (int i = 0; i < n; i++) {
            money[i] = Integer.parseInt(br.readLine());
            sum += money[i];
        }

        int max = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            if (money[i] > max) {
                max = money[i];
            }
        }

        int left = max;
        int right = sum;

        while (left <= right) {
            int mid = (left + right) / 2;
            int cnt = 1;
            int remain = mid;
            for (int i = 0; i < n; i++) {
                if (remain < money[i]) {
                    cnt++;
                    remain = mid;
                }
                remain -= money[i];
            }

            if (cnt <= m) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }

        System.out.println(left);
    }
}