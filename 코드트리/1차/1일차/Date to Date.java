import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        String[] arr = input.split(" ");
        List<Integer> list = new ArrayList<>();
        int[] month = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        for (String s : arr) {
            list.add(Integer.parseInt(s));
        }

        int result;

        if (list.get(3) < list.get(1)) {
            list.set(2, list.get(2) - 1);
            list.set(3, list.get(3) + month[list.get(2) - 1]);
        }
        result = list.get(3) - list.get(1);

        for (int i = 0; i < list.get(2) - list.get(0); i++) {
            result += month[list.get(0) - 1 + i];
        }

        System.out.println(result + 1);
    }
}