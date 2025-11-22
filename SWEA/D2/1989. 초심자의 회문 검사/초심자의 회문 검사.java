import java.util.*;

class Solution
{
	public static void main(String args[]) throws Exception
	{
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
        sc.nextLine();
		for(int i = 0; i < T; i++)
		{
            String input = sc.nextLine().trim();
            String reverseInput = new StringBuilder(input).reverse().toString();         
            
            System.out.print("#" + (i + 1) + " ");
            System.out.println(input.equals(reverseInput) ? 1 : 0);
		}
	}
}