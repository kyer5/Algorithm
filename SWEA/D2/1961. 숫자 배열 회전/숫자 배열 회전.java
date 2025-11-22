import java.util.*;

class Solution {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		
		for(int tc = 1; tc <= T; tc++)
		{
            int n = sc.nextInt();
            int[][] a = new int[n][n];
			for (int i = 0; i < n; i++) {
            	for (int j = 0; j < n; j++) {
                	a[i][j] = sc.nextInt();
                }
            }			
            System.out.println("#" + tc);
            int[][] a90 = new int[n][n];
            int[][] a180 = new int[n][n];
            int[][] a270 = new int[n][n];
            for (int i = 0; i < n; i++) {
            	for (int j = 0; j < n; j++) {
                	a90[j][n-1-i] = a[i][j];
                    a180[n-1-i][n-1-j] = a[i][j];
                    a270[n-1-j][i] = a[i][j];
                }
            }
           
            for (int i = 0; i < n; i++) {
                	String result90 = "";
                    String result180 = "";
                    String result270 = "";
                for (int j = 0; j < n; j++) {
                    result90 += String.valueOf(a90[i][j]);
                    result180 += String.valueOf(a180[i][j]);
                    result270 += String.valueOf(a270[i][j]);
                }
                System.out.println(result90 + " " + result180 + " " + result270);
            }
		}
	}
}