import java.util.*;
	
class Solution
{
	public static void main(String args[]) 
	{
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
        int[] days = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

		for(int i = 0; i < T; i++)
		{
            int m1 = sc.nextInt();
            int d1 = sc.nextInt();
            int m2 = sc.nextInt();
            int d2 = sc.nextInt();
            
            int month = m2 - m1;
            int result = 0;
            for (int j = 0; j < month; j++) {
            	result += days[m1 - 1 + j];
            }
            result += d2 - d1 - 1;
            System.out.println("#" + (i + 1) + " " + (result + 2));
		}
	}
}