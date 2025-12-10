import java.util.*;

class Solution {
    public int[] solution(int numer1, int denom1, int numer2, int denom2) {
        int numer = (numer1 * denom2) + (numer2 * denom1);
        int denom = denom1 * denom2;
        
        int i = 2;
        while (true) {
            if (numer % i == 0 && denom % i == 0 && numer >= i) {
                numer /= i;
                denom /= i;
                i = 2;
            } else if (numer < i) {
                break;
            } else {
                i++;
            }
        }
        
        return new int[]{numer, denom};
    }
}