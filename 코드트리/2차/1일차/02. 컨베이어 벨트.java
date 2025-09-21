import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int t = Integer.parseInt(st.nextToken());
        String[] arr = new String[2 * n];

        int cnt = 0;
        for (int i = 1; i <= 2; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < n; j++) {
                arr[cnt] = st.nextToken();
                cnt++;
            }
        }

        for (int i = 0; i < t; i++) {
            String temp = arr[2 * n - 1];
            for (int j = 2 * n - 1; j >= 1; j--) {
                arr[j] = arr[j - 1];
            }
            arr[0] = temp;
        }

        cnt = 0;
        for (String s : arr) {
            if (cnt == n) {
                System.out.println();
            }
            System.out.print(s + " ");
            cnt++;
        }
    }
}
