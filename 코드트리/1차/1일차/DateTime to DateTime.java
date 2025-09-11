import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        String[] arr = input.split(" ");
        List<Integer> list = new ArrayList<>();

        for (String s : arr) {
            list.add(Integer.parseInt(s));
        }

        if (list.get(0) < 11 || (list.get(0) == 11 && list.get(1) < 11) || (list.get(0) == 11 && list.get(1) == 11 && list.get(2) < 11)) {
            System.out.println(-1);
            return;
        }

        int result;
        if (list.get(2) < 11) {
            list.set(1, list.get(1) - 1);
            list.set(2, list.get(2) + 60);
            if (list.get(1) < 11) {
                list.set(0, list.get(0) - 1);
                list.set(1, list.get(1) + 24);
            }
        }
        result = list.get(2) - 11;
        result += (list.get(1) - 11) * 60;
        result += (list.get(0) - 11) * 24 * 60;

        System.out.println(result);
    }
}