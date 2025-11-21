import java.util.*;

class Solution
{
	public static void main(String args[]) throws Exception
	{
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
            
		for(int i = 0; i < T; i++) {
            sc.nextInt();
            
            int[] count = new int[101];
            int mostFrequentScore = 0;
            int mostCount = 0;
            
            for (int j = 0; j < 1000; j++) {
                int score = sc.nextInt();
                int newCount = count[score]++;
                
                if (newCount > mostCount || newCount == mostCount && score > mostFrequentScore) {
                    mostCount = newCount;
                    mostFrequentScore = score;
                }
            }
			System.out.println("#" + (i + 1) + " " + mostFrequentScore);            
		}
	}
}