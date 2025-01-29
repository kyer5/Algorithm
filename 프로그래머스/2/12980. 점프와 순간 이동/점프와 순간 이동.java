import java.util.*;

public class Solution {
    public int solution(int n) {
        int ans = 1;

        do {
            if (n == 1) {
                return 1;
            }
            if (n % 2 != 0) {
                ans++;
                n--;
            } else {
                n /= 2;
            }
        } while (n != 1);

        return ans;
    }
}