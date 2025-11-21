import java.util.*;
import java.io.FileInputStream;

class Solution
{
	public static void main(String args[]) throws Exception
	{
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		
		for(int i = 0; i < T; i++)
		{
            long result = 0;
            long sum = 0;
            List<Integer> numbers = new ArrayList<>();
			for (int j = 0; j < 10; j++) {
                int number = sc.nextInt();
            	numbers.add(number);
                sum += number;
            }
            int max = Collections.max(numbers);
            int min = Collections.min(numbers);
            result = Math.round((sum - max - min) / 8.0);
            System.out.println("#" + (i + 1) + " " + result);
		}
	}
}