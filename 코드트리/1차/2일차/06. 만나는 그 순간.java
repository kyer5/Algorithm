import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        ArrayList<Integer> aList = new ArrayList<>();
        ArrayList<Integer> bList = new ArrayList<>();

        int aCurrent = 0;
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            String direction = st.nextToken();
            int seconds = Integer.parseInt(st.nextToken());

            switch (direction) {
                case "L":
                    for (int j = 0; j < seconds; j++) {
                        aList.add(aCurrent--);
                    }
                    break;
                case "R":
                    for (int j = 0; j < seconds; j++) {
                        aList.add(aCurrent++);
                    }
                    break;
            }
        }

        int bCurrent = 0;
        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine());
            String direction = st.nextToken();
            int seconds = Integer.parseInt(st.nextToken());

            switch (direction) {
                case "L":
                    for (int j = 0; j < seconds; j++) {
                        bList.add(bCurrent--);
                    }
                    break;
                case "R":
                    for (int j = 0; j < seconds; j++) {
                        bList.add(bCurrent++);
                    }
                    break;
            }
        }

        int result = -1;
        for (int i = 1; i < aList.size(); i++) {
            if (aList.get(i).equals(bList.get(i))) {
                result = i;
                break;
            }
        }

        System.out.println(result);
    }
}
