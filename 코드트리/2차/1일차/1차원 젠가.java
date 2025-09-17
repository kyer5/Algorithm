import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0; i < N; i++) {
            list.add(Integer.parseInt(br.readLine()));
        }

        int[][] removeArr = new int[2][2];
        for (int i = 0; i < 2; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            removeArr[i][0] = Integer.parseInt(st.nextToken());
            removeArr[i][1] = Integer.parseInt(st.nextToken());
        }

        for (int i = 0; i < 2; i++) {
            for (int j = removeArr[i][1] - 1; j >= removeArr[i][0] - 1; j--) {
                list.remove(j);
            }
        }

        System.out.println(list.size());
        for (Integer i : list) {
            System.out.println(i);
        }
    }
}
