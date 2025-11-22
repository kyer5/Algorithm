import java.util.*;

class Solution {
	public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
        sc.nextLine();
		
		for (int i = 0; i < T; i++) {
        	String s = sc.next();
            int answer = 0;
            
           	for (int j = 1; j <= 10; j++) {
            	if (s.substring(0, j).equals(s.substring(j, j + j))) {
                	answer = j;
                    break;
                }
            }
            
            System.out.println("#" + (i + 1) + " " + answer);
        }
	}
}