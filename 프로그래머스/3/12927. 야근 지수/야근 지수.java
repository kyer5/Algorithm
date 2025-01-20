import java.util.Collections;
import java.util.PriorityQueue;

class Solution {
    public long solution(int n, int[] works) {
        PriorityQueue<Integer> q = new PriorityQueue<>(Collections.reverseOrder());
        for (int work : works) {
            q.add(work);
        }

        while (n > 0) {
            int work = q.remove();
            if (work == 0) {
                break;
            }
            work--;
            q.add(work);
            n--;
        }

        long result = 0;
        for (int work : q) {
            result += (long) work * work;
        }

        return result;
    }
}