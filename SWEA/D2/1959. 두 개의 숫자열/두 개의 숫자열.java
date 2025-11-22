import java.util.*;

class Solution
{
	public static void main(String args[]) 
	{
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
        
		for(int i = 0; i < T; i++)
		{
            int n = sc.nextInt();
            int m = sc.nextInt();
            
            int[] A = new int[n];
            int[] B = new int[m];
            
            for (int j = 0; j < n; j++) {
            	A[j] = sc.nextInt();
            }
            for (int j = 0; j < m; j++) {
            	B[j] = sc.nextInt();
            }
            
            if (n > m) {
            	int[] temp = A;
                A = B;
                B = temp;
                int t = n;
                n = m;
                m = t;
            }
            
            int max = Integer.MIN_VALUE;
            for (int j = 0; j <= m - n; j++) {
            	int sum = 0;
                for (int k = 0; k < n; k++) {
                	sum += A[k] * B[k + j];
                }
                max = Math.max(max, sum);
            }
            
            System.out.println("#" + (i + 1) + " " + max);
		}
	}
}