import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        String[][] arr = new String[n][4];

        StringTokenizer st;
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            arr[i][0] = st.nextToken();
            arr[i][1] = st.nextToken();
            arr[i][2] = st.nextToken();
            arr[i][3] = st.nextToken();
        }

        Arrays.sort(arr, (s1, s2) -> {
            if (Integer.parseInt(s1[1]) == Integer.parseInt(s2[1])) {
                if (Integer.parseInt(s1[2]) == Integer.parseInt(s2[2])) {
                    if (Integer.parseInt(s1[3]) == Integer.parseInt(s2[3])) {
                        return s1[0].compareTo(s2[0]);
                    } else {
                        return Integer.parseInt(s2[3]) - Integer.parseInt(s1[3]);
                    }
                } else {
                    return Integer.parseInt(s1[2]) - Integer.parseInt(s2[2]);
                }
            } else {
                return Integer.parseInt(s2[1]) - Integer.parseInt(s1[1]);
            }
        });

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            sb.append(arr[i][0] + "\n");
        }
        System.out.println(sb);
    }
}
