import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++) {
            int year = Integer.parseInt(br.readLine());
            int y = year % 100;
            if ((year + 1) % y == 0) {
                System.out.println("Good");
            } else {
                System.out.println("Bye");
            }
        }
    }
}