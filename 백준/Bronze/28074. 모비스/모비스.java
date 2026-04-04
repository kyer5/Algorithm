import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();

        if (input.contains("M") && input.contains("O") && input.contains("B") && input.contains("I") && input.contains("S")) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}