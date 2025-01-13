class Solution {
    public int solution(int n) {
        int cnt = 0;

        for (int i = 1; i <= n; i++) {
            int result = 0;
            for (int j = i; j <= n; j++) {
                result += j;
                if (result == n) {
                    cnt++;
                    break;
                }
                if (result > n) {
                    break;
                }
            }
        }

        return cnt;
    }
}