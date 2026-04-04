import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String teamName1 = "";
        String teamName2 = "";

        int[] solveds = new int[3];
        int[] years = new int[3];
        String[] firstNames = new String[3];
        for (int i = 0; i < 3; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            solveds[i] = Integer.parseInt(st.nextToken());
            years[i] = (Integer.parseInt(st.nextToken())) % 100;
            firstNames[i] = st.nextToken();
        }

        Arrays.sort(years);
        for (int i = 0; i < 3; i++) {
            teamName1 += String.valueOf(years[i]);
        }

        for (int i = 0; i < 2; i++) {
            for (int j = i + 1; j < 3; j++) {
                int intTemp = 0;
                String strTemp = "";
                if (solveds[i] < solveds[j]) {
                    intTemp = solveds[i];
                    solveds[i] = solveds[j];
                    solveds[j] = intTemp;
                    strTemp = firstNames[i];
                    firstNames[i] = firstNames[j];
                    firstNames[j] = strTemp;
                }
            }
        }

        for (int i = 0; i < 3; i++) {
            teamName2 += firstNames[i].charAt(0);
        }

        System.out.println(teamName1);
        System.out.println(teamName2);
    }
}