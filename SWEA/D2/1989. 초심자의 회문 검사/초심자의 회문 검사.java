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
            String[] inputs = input.split("");
            List<String> list = Arrays.asList(inputs);
            Collections.reverse(list);
            String reverseInput = "";
            for (int j = 0; j < list.size(); j++) {
            	reverseInput += list.get(j);
            }
            System.out.print("#" + (i + 1) + " ");
            if (input.equals(reverseInput)) {
            	System.out.println("1");
            } else {
            	System.out.println("0");
            }
		}
	}
}