import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[] mushrooms = new int[10];
        int[] pSum = new int[10];
        for (int i = 0; i < 10; i++) {
            mushrooms[i] = Integer.parseInt(br.readLine());
        }

        pSum[0] = mushrooms[0];
        for (int i = 1; i < 10; i++) {
            pSum[i] = pSum[i - 1] + mushrooms[i];
        }

        int min = Integer.MAX_VALUE;
        int result = 0;
        for (int i = 0; i < 10; i++) {
            if (Math.abs(100 - pSum[i]) <= min) {
                min = 100 - pSum[i];
                result = pSum[i];
            }
        }

        System.out.println(result);
    }
}