import java.util.*;

class Solution
{
	public static void main(String args[]) throws Exception
	{
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();

       	long[] results = new long[T];
		for(int i = 0; i < T; i++) {
            int n = sc.nextInt();
            List<Integer> numbers = new ArrayList<>();
            for (int j = 0; j < n; j++) {
                numbers.add(sc.nextInt());
            }
            int max = 0;
            Collections.reverse(numbers);
            max = numbers.get(0);
            for (int j = 1; j < n; j++) {
                if (numbers.get(j) < max) {
                    results[i] += max - numbers.get(j);
                } else {
                	max = numbers.get(j);
                }
            }
            System.out.println("#" + (i + 1) + " " + results[i]);
		}
	}
}