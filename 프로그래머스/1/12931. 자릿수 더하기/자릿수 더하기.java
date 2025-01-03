import java.util.*;

public class Solution {
    public int solution(int n) {
        String s = String.valueOf(n);
        String[] arr = s.split("");
        int sum = 0;

        for (int i = 0; i < s.length(); i++) {
            sum += Integer.parseInt(arr[i]);
        }

        return sum;
    }
}