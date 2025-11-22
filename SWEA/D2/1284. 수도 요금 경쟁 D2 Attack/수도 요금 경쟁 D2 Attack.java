import java.util.*;

class Solution
{
	public static void main(String args[]) throws Exception
	{
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();

		for(int i = 0; i < T; i++)
		{
            int p = sc.nextInt();
            int q = sc.nextInt();
            int r = sc.nextInt();
            int s = sc.nextInt();
            int w = sc.nextInt();
            List<Integer> results = new ArrayList<>();
            results.add(w * p);
            if (w <= r) {
            	results.add(q);
            } else {
            	results.add(q + ((w - r) * s));
            }
            System.out.println("#" + (i + 1) + " " + Collections.min(results));
		}
	}
}