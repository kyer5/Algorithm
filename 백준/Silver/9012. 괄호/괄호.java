import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int t = Integer.parseInt(br.readLine());
        for (int i = 0; i < t; i++) {
            String input = br.readLine();

            int cnt = 0;
            boolean isValid = true;

            for (int j = 0; j < input.length(); j++) {
                if (input.charAt(j) == '(') {
                    cnt++;
                } else {
                    cnt--;
                }

                if (cnt < 0) {
                    isValid = false;
                    break;
                }
            }

            if (cnt == 0 && isValid) {
                sb.append("YES").append("\n");
            } else {
                sb.append("NO").append("\n");
            }
        }

        System.out.println(sb);
    }
}