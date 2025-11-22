import java.util.*;

class Solution {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();

		for (int tc = 1; tc <= T; tc++) {
            int n = sc.nextInt();
            int k = sc.nextInt();
            int[][] board = new int[n][n];
            for (int i = 0; i < n; i++) {
            	for (int j = 0; j < n; j++) {
                	board[i][j] = sc.nextInt();
                }
            }
            
            int result = 0;
        	for (int i = 0; i < n; i++) {
            	StringBuilder sb = new StringBuilder();
                for (int j = 0; j < n; j++) {
                	sb.append(board[i][j]);                
                }
                for (String seg : sb.toString().split("0")) {
                	if (seg.length() == k) {
                    	result++;
                    }
                }
            }
            for (int i = 0; i < n; i++) {
            	StringBuilder sb = new StringBuilder();
                for (int j = 0; j < n; j++) {
                	sb.append(board[j][i]);                
                }
                for (String seg : sb.toString().split("0")) {
                	if (seg.length() == k) {
                    	result++;
                    }
                }
            }
            System.out.println("#" + tc + " " + result);
		}
	}
}