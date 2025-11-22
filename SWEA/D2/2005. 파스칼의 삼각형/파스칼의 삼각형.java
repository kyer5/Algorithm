import java.util.*;

class Solution {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		
		for(int tc = 1; tc <= T; tc++) {
			int n = sc.nextInt();
            int[][] arr = new int[n][n];
            for (int i = 0; i < n; i++) {
            	arr[i][0] = 1;
                arr[i][i] = 1;
                for (int j = 1; j < i; j++) {
                	arr[i][j] = arr[i-1][j-1] + arr[i-1][j];
                }
            }
            System.out.println("#" + tc);

            for (int i = 0; i < n; i++) {
            	for (int j = 0; j <= i; j++) {
               		System.out.print(arr[i][j] + " ");
                }
               	System.out.println();
            }
		}
	}
}