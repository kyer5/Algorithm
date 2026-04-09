import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int num = Integer.parseInt(st.nextToken());

        if (num == 1) {
            return;
        } else {
            int i = 2;
            while (num != 1) {
                if (num % i == 0) {
                    num /= i;
                    System.out.println(i);
                } else {
                    i++;
                }
            }
        }
    }
}