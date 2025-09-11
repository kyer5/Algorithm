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

        int result;
        if (list.get(3) < list.get(1)) {
            list.set(2, list.get(2) - 1);
            list.set(3, list.get(3) + 60);
        }
        result = list.get(3) - list.get(1);
        result += (list.get(2) - list.get(0)) * 60;

        System.out.println(result);
    }
}