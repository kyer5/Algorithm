import java.util.*;

class Solution {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();

		for(int i = 0; i < T; i++) {
            int n = sc.nextInt();
            int original = n;
            HashSet<Integer> numbers = new HashSet<>();
            int cnt = 0;
            
            while (numbers.size() < 10) {
                cnt++;
                int current = n * cnt;
                String s = String.valueOf(current);

                for (int j = 0; j < s.length(); j++) {
                	numbers.add(s.charAt(j) - '0');
                }               
            }
            
            System.out.println("#" + (i + 1) + " " + (cnt * original));
		}
	}
}