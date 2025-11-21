import java.util.*;

class Solution
{
	public static void main(String args[]) throws Exception
	{
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();

		for(int i = 1; i <= T; i++) {
            String s = String.valueOf(i);
            int count = 0;
            
            for (char c : s.toCharArray()) {
            	if (c == '3' || c == '6' || c == '9') {
                	count++;
                }
            }
            
            if (count == 0) {
            	System.out.print(i + " ");
            } else {
            	for (int j = 0; j < count; j++) {
                	System.out.print("-");
                }
                System.out.print(" ");
            }
		}
	}
}