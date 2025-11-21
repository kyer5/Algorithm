import java.util.Scanner;
import java.io.FileInputStream;

class Solution
{
	public static void main(String args[]) throws Exception
	{
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
        
        System.out.print(1 + " ");
        
        int n = 1;
		for(int i = 1; i <= T; i++)
		{
            n *= 2;
            System.out.print(n + " ");
		}
	}
}