import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int me = Integer.parseInt(br.readLine());
        PriorityQueue<Integer> pq = new PriorityQueue<Integer>(Collections.reverseOrder());

        for (int i = 1; i < n; i++) {
            pq.add(Integer.parseInt(br.readLine()));
        }

        int cnt = 0;
        
        while (!pq.isEmpty() && me <= pq.peek()) {
            int top = pq.poll();

            top--;
            me++;
            cnt++;

            pq.add(top);
        }

        System.out.println(cnt);
    }
}