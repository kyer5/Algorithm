import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static final int OFFSET = 1000;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[][] coordinatePlane = new int[2001][2001];

        int area = 0;
        StringTokenizer st;
        for (int i = 0; i < 2; i++) {
            st = new StringTokenizer(br.readLine());
            int x1 = Integer.parseInt(st.nextToken()) + OFFSET;
            int y1 = Integer.parseInt(st.nextToken()) + OFFSET;
            int x2 = Integer.parseInt(st.nextToken()) + OFFSET;
            int y2 = Integer.parseInt(st.nextToken()) + OFFSET;

            for (int j = y1; j < y2; j++) {
                for (int k = x1; k < x2; k++) {
                    if (coordinatePlane[j][k] == 0) {
                        coordinatePlane[j][k] = 1;
                        area++;
                    }
                }
            }
        }

        st = new StringTokenizer(br.readLine());
        int x1 = Integer.parseInt(st.nextToken()) + OFFSET;
        int y1 = Integer.parseInt(st.nextToken()) + OFFSET;
        int x2 = Integer.parseInt(st.nextToken()) + OFFSET;
        int y2 = Integer.parseInt(st.nextToken()) + OFFSET;
        for (int i = y1; i < y2; i++) {
            for (int j = x1; j < x2; j++) {
                if (coordinatePlane[i][j] == 1) {
                    coordinatePlane[i][j] = 0;
                    area--;
                }
            }
        }

        System.out.println(area);
    }
}
