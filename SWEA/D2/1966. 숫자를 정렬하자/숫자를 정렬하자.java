import java.util.*;

class Solution {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
        
		for(int i = 0; i < T; i++) {
			int n = sc.nextInt();
            List<Integer> numbers = new ArrayList<>();
            for (int j = 0; j < n; j++) {
            	numbers.add(sc.nextInt());
            }
            Collections.sort(numbers);
            System.out.print("#" + (i + 1) + " ");
            for (int j = 0; j < n; j++) {
            	System.out.print(numbers.get(j) + " ");
            }
            System.out.println();
        }
	}
}