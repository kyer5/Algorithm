import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        String[] arr = input.split("");

        List<String> list = new ArrayList<>(Arrays.asList(arr));

        Collections.reverse(list);

        List<Integer> intList = new ArrayList<>();

        for (String s : list) {
            intList.add(Integer.parseInt(s));
        }

        int size = 1;
        int result = 0;

        if (intList.get(0) == 1) {
            result = 1;
        }

        for (int i = 1; i < list.size(); i++) {
            if (intList.get(i) == 1) {
                int add = 1;
                for (int j = 0; j < size; j++) {
                    add *= 2;
                }
                result += add;
            }
            size++;
        }

        System.out.println(result);
    }
}