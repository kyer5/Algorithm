// M개의 기기
// 총 대기 시간 = 걸려 있는 모든 카드의 예상 플레이 시간의 합
// 사람들은 도착한 순서대로 M개의 기기별 총 대기 시간이 가장 짧은 곳에 자신의 카드를 둠
// 총 대기 시간이 동일하면 아무 데나
// N + 1번째 코이가 오락실 A에서 기다려야 하는 최소 대기 시간

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
        for (int i = 0; i < m; i++) {
            pq.add(0);
        }

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            int time = Integer.parseInt(st.nextToken());

            int min = pq.poll();
            pq.add(min + time);
        }

        if (pq.peek() <= k) {
            System.out.println("WAIT");
        } else {
            System.out.println("GO");
        }
    }
}