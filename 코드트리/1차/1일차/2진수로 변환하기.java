import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int input = Integer.parseInt(br.readLine());
        List<String> list = new ArrayList<>();

        if (input == 0) {
            System.out.println(0);
            return;
        }

        while (input > 0) {
            list.add(String.valueOf(input % 2));
            input /= 2;
        }

        Collections.reverse(list);

        for (String s : list) {
            System.out.print(s);
        }
    }
}