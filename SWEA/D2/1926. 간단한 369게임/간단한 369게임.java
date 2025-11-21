import java.util.*;

class Solution
{
	public static void main(String args[]) throws Exception
	{
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();

		for(int i = 1; i <= T; i++) {
            if (!String.valueOf(i).contains("3") && !String.valueOf(i).contains("6") && !String.valueOf(i).contains("9")) {
                System.out.print(i + " ");
            } else {
                String[] numbers = String.valueOf(i).split("");
                int count = 0;
                for (int j = 0; j < numbers.length; j++) {
                	if (numbers[j].contains("3")) {
                    	count++;
                    } else if (numbers[j].contains("6")) {
                    	count++;
                    } else if (numbers[j].contains("9")) {
                    	count++;
                    }
                }
                for (int j = 0; j < count; j++) {
                	System.out.print("-");
                }
                System.out.print(" ");
            }
		}
	}
}