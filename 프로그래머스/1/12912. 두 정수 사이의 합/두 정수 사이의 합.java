class Solution {
    public long solution(int a, int b) {
        long result = 0;
        if (a <= b) {
            for (int i = a; i <= b; i++) {
                result += i;
            }
        } else {
            for (int i = a; i >= b; i--) {
                result += i;
            }
        }
        return result;
    }
}